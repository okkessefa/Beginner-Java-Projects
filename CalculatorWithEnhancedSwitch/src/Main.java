import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char operator;
        double operant1;
        double operant2;
        double result = 0;
        boolean isValidOperation= true;

        System.out.print("Enter the first number: ");
        operant1 = scanner.nextDouble();
        System.out.print("Enter the operator");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        operant2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = operant1 + operant2;
            case '-' -> result = operant1 - operant2;
            case '/' -> {
                if (operant2 == 0) {
                    System.out.println("Cannot divide by zero");
                    isValidOperation = false;
                } else {
                    result = operant1 / operant2;
                } 
            }
            case '*' -> result = operant1 * operant2;
            case '^' -> result = Math.pow(operant1, operant2);
            default -> {
                System.out.println("Invalid Operation");
                isValidOperation = false;
            }
        }
        if (isValidOperation){
            System.out.printf("THe result is : %.2f", result);
        }
        scanner.close();
    }
}
