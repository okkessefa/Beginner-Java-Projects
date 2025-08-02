import java.util.Scanner;

public class Main {
    public static void main(String[] ars){
        // Temperature Converter Program with ternary operator

        // Declare the variables
        Scanner scanner = new Scanner(System.in);
        double temperature;
        double newTemperature;
        String choice;

        // Welcome Message and menu flow

        System.out.print("Enter the temperature ( F or C ): ");
        temperature = scanner.nextDouble();

        System.out.print("Convert the Fahrenheit ot Celsius: ");
        choice = scanner.next().toUpperCase();

        newTemperature = (choice.equals("C")) ? ((temperature -32 ) * 5 / 9) : ((temperature * 9 / 5)+ 32);

        System.out.printf("%.2f",newTemperature);


        //Condition 1:  F -> C
        //Condition 2:  C -> F



        scanner.close();
    }
}
