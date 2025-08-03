// JAVA BANKING PROGRAM FOR BEGINNERS
// import libraries
import java.util.Scanner;

public class Main
{
    // global scanner object to use every scope
    static Scanner scanner = new Scanner(System.in);

    public  static void main(String[] args)
    {
        // DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;

        // DISPLAY MENU
        while(isRunning)
        {

            System.out.println("*************************");
            System.out.println("****Banking System*******");
            System.out.println("*************************");
            // GET AND PROCESS USERS CHOICE
            System.out.println("1st option: show balance");
            System.out.println("2nd option: deposit");
            System.out.println("3rd option: withdraw");
            System.out.println("4th option: Quit");
            System.out.print("Enter your option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // to clear the newline buffer if you expand to more string inputs later.

            switch (choice)
            {
                case 1 -> showBalance(balance);
                case 2 -> balance = deposit(balance);
                case 3 -> balance = withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid option. Please try again.");

            }

        }

        // EXIT MESSAGE
        System.out.println("Thank you for coming");
    }

    // showBalance()
    static void showBalance(double balance)
    {
        System.out.printf("Your account balance: %.2f", balance);
        System.out.println();
    }
    // deposit()
    static double deposit(double balance)
    {
        double amount;
        System.out.print("Enter the money you want to deposit: ");
        amount = scanner.nextDouble();
        if (amount < 0)
        {
            System.out.println("Cannot enter negative number");
        }else
        {
            balance += amount;
            showBalance(balance);
        }
        return balance;
    }
    // withdraw()
    static double withdraw(double balance)
    {
        double withDraw;

        System.out.println("Enter the money you want to withdraw: ");
        withDraw = scanner.nextDouble();
        if(withDraw > balance)
        {
            System.out.println("The withdrawal cannot be greater than the balance.");
        }else
        {
            balance -= withDraw;
            showBalance(balance);
        }
        return balance;
    }

}