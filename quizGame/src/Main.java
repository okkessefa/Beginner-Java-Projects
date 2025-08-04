import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        //JAVA QUIZ GAME


        // QUESTIONS array[]
        String[] questions = {
                "Q1. What is the correct signature of the main method in Java?",
                "Q2. Which of the following is not a primitive data type in Java?",
                "Q3. Which keyword is used to create an object in Java?",
                "Q4. What is the correct way to import the Scanner class from the Java API?",
                "Q5. Which operator is used to compare two values for equality in Java?"
        };
        // OPTIONS array[][]
        String[][] options = {
                {"1. public static void Main(String[] args)", "2. public void main(String args[])", "3. public static void main(String[] args)", "4. static public void main(String args[])"},
                {"1. int", "2. boolean", "3. String", "4. char"},
                {"1. create", "2. new", "3. class", "4. object"},
                {"1. include java.util.Scanner;", "2. using java.util.Scanner;", "3. import java.util.Scanner;", "3. Scanner java.util.import;"},
                {"1. =", "2. ==", "3. equals", "4. !="}
        };
        // DECLARE VARIABLES
        int[] answers = {1, 3, 2, 3, 2};
        //WELCOME MESSAGE
        System.out.println("----------------------");
        System.out.println("----Java Quiz Game----");
        System.out.println("----------------------");

        Scanner scanner = new Scanner(System.in);


        int result = 0;
        int userAnswer;

        String askAgain;
        do {

            //QUESTION (Loop)
            for (int i = 0; i < questions.length; i++)
            {
                System.out.println(questions[i]);
                //OPTIONS
                for (String option : options[i])
                {
                    System.out.println(option);
                }
                System.out.print("\n");
                //GET GUESS FROM USER
                System.out.print("Enter your answers: ");
                userAnswer = scanner.nextInt();
                //CHECK OUR GUESS
                System.out.println("****************");
                if(userAnswer == answers[i])
                {
                    System.out.println("****CORRECTS****");
                    System.out.println("****************");
                    result += 1;
                }else
                {
                    System.out.println("*****WRONG*****");
                    System.out.println("****************");

                }
            }
            System.out.printf("You get %d of %d\n", result, questions.length);
            System.out.print("Would you like to play again? (Y/N) :");
            askAgain = scanner.nextLine().toUpperCase();
            scanner.nextLine();
        } while (askAgain.equals("Y"));

        System.out.println("Thank you for playing");


        scanner.close();
    }
}
