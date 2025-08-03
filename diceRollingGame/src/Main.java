import  java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare variables
        int total = 0;
        int throwTime;

        System.out.print("How many times do you want to throw the dice: ");
        throwTime = scanner.nextInt();

        if(throwTime < 0)
        {
            System.out.println("Throwing # dice cannot be less than zero");
        }
        else
        {
            for(int i = 0; i < throwTime; i++)
            {
                int roll = random.nextInt(1,7);
                diceDrawer(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("------------------------");
            System.out.println("Total: "+ total);
        }

        scanner.close();
    }
    // Dice drawer function
    static void diceDrawer(int randomNumber)
    {
        String dice1 = """
                -----------
                |         |
                |    ●    |
                |         |
                -----------
                """;
        String dice2 = """
                -----------
                |         |
                | ●     ● |
                |         |
                -----------
                """;
        String dice3 = """
                -----------
                | ●       |
                |    ●    |
                |       ● |
                -----------
                """;
        String dice4 = """
                -----------
                | ●     ● |
                |         |
                | ●     ● |
                -----------
                """;
        String dice5 = """
                -----------
                | ●     ● |
                |    ●    |
                | ●     ● |
                -----------
                """;
        String dice6 = """
                -----------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                -----------
                """;
        switch (randomNumber)
        {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }

    }
}
