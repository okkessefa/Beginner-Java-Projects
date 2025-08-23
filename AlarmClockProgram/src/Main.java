import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String path = "Lets go back - Patrick Patrikios.wav";

        while(alarmTime == null)
        {
            try
            {
                System.out.print("Enter an alarm time (HH:MM:SS) ->");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for: " + alarmTime);
            }
            catch (DateTimeParseException e)
            {
                System.out.println("Invalid Format, Please use (HH:MM:SS) ");
            }
        }

        AlarmClock alarmclock = new AlarmClock(alarmTime, path, scanner);
        Thread threadAlarm = new Thread(alarmclock);

        threadAlarm.start();

    }
}
