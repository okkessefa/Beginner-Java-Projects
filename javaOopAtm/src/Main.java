import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int choice;

        Account account1 = new Account("account1", 100);
        Account account2 = new Account("account", 100);
        Account account3 = new Account("account", 100);
        Account account4 = new Account("account", 100);

        System.out.println("Welcome the Banking System that powered by OOP structure");
        while(isRunning) {
            System.out.println("Account Options");
            System.out.println("1 -> account1");
            System.out.println("2 -> account2");
            System.out.println("3 -> account3");
            System.out.println("4 -> account4");
            System.out.println("5 -> exit");
            System.out.print("Choose option number: ");
            choice = scanner.nextInt();

            Account selectedAccount = null;
            if (choice == 1) {
                selectedAccount = account1;
            }
            else if (choice == 2) {
                selectedAccount = account1;
            }
            else if (choice == 3) {
                selectedAccount = account1;
            }
            else if(choice == 4){
                selectedAccount = account1;
            }
            else if(choice == 5){
                System.out.println("Exiting...");
                System.out.println("Thank you for preferring us");
                scanner.close();
                return;
            }else{
                System.out.println("Invalid choice. Try again.");
                continue;
            }
            while(isRunning){
                int option;
                double amount;

                System.out.println("\nMenu options");
                System.out.println("Press 1 for Deposit");
                System.out.println("Press 2 for Withdraw");
                System.out.println("Press 3 for Check Balance");
                System.out.println("Press 4 for Get Account Name");
                System.out.println("Press 5 for exit");
                option = scanner.nextInt();
                switch(option){
                    case 1 :
                        System.out.print("Enter the deposit amount: ");
                        amount = scanner.nextDouble();
                        selectedAccount.deposit(amount);
                        break;
                    case 2:
                        System.out.print("Enter the withdraw amount: ");
                        amount = scanner.nextDouble();
                        selectedAccount.withdraw(amount);
                        break;
                    case 3:
                        selectedAccount.checkBalance();
                        break;
                    case 4:
                        selectedAccount.getAccountNumber();
                        break;
                    case 5:
                        scanner.close();
                        isRunning = false;
                    default:
                        break;
                }
            }
        }
        System.out.println("Exiting...");
        System.out.println("Thank you for preferring us");
        scanner.close();
    }
}