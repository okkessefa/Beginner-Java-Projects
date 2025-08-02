import java.util.Scanner;

public class Main {
    public static void main(String[] arg){

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height / 2;

        System.out.println("The area of rectangle is " + area + " cm^2.");

        scanner.close();

    }
}
