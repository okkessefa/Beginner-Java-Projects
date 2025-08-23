import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable
{
    private final LocalTime alarmTime;
    private final String path;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String path, Scanner scanner)
    {
        this.alarmTime = alarmTime;
        this.path = path;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {
            try
            {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d",
                                    now.getHour(),
                                    now.getMinute(),
                                    now.getSecond());
            }
            catch (InterruptedException e)
            {
                System.out.println("The program is interrupted");
            }
        }
        System.out.println("\n*ALARM NOISES*");
        playSound(path);

    }
    public void playSound(String path){

        File audioFile = new File(path);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press *Enter* to stop alarm ");
            scanner.nextLine();
            clip.close();

            scanner.close();
        }
        catch (IOException e){
            System.out.println("Error reading audio file");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("This format is not supported");
        }
        catch (LineUnavailableException e){
            System.out.println("Audio is unavailable");
        }
    }
}
