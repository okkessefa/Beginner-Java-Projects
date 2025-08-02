import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // WEIGHT CONVERSION PROGRAM
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double weight;
        double newWeight;
        int choice;

        // welcome message
        System.out.println("Welcome the weight converter program\n");

        // prompt for user choice
        System.out.println("Option 1: lbs to kgs");
        System.out.println("Option 2: kgs to lbs");
        System.out.print("Enter the your choice: ");
        choice = scanner.nextInt();

        // option 1 convert lbs to kgs
        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight is in kgs is: %.2f", newWeight);
        }
        // option 2 convert kgs to lbs
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight is in lbs is: %.2f", newWeight);
        }
        // else print not a valid choice
        else{
            System.out.println("This input is invalid");
        }
        scanner.close();
    }
}
