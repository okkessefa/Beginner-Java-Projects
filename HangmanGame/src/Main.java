import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> gameWord = new ArrayList<>();
        String word = "lahmacun";
        boolean isRunning = true;
        int guessWrongCount = 0;
        for(int i = 0; i<word.length(); i++)
        {
            gameWord.add('_');
        }
        System.out.println("***************************");
        System.out.println("  Welcome to Hangman Game  ");
        System.out.println("***************************");

        while(isRunning)
        {
            System.out.println(drawHangman(guessWrongCount));
            for(char letter : gameWord)
            {
                System.out.print(letter + " ");
            }
            System.out.println();
            System.out.print("Enter letter to guess word: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0)
            {
               System.out.println("Correct guess");

               for(int j = 0; j < word.length(); j++)
               {
                    if(word.charAt(j) == guess)
                    {
                        gameWord.set(j, guess);
                    }
               }
                if (!gameWord.contains('_'))
                {
                    System.out.println(drawHangman(guessWrongCount));
                    System.out.println("You WINN");
                    System.out.println("The game was : "+ word);
                    isRunning = false;
                }
            }
            else
            {
                System.out.println("Wrong Guess");
                guessWrongCount++;
            }
            if (guessWrongCount >= 6) {
                System.out.println(drawHangman(guessWrongCount));
                System.out.println("You LOSEE");
                System.out.println("The game was : " + word);
                isRunning = false;
            }
        }
        scanner.close();
    }
    static String drawHangman(int hangmantype)
    {
        return switch (hangmantype)
        {
            case 0 -> """ 
                    """;
            case 1 -> """
                        o
                    
                    
                    """;
            case 2 -> """
                        o
                        |
                    
                    """;
            case 3 -> """
                        o
                       /|
                    
                    """;
            case 4 -> """
                        o
                       /|\\
                    
                    """;
            case 5 -> """
                        o
                       /|\\
                       /
                    """;
            case 6 -> """
                        o
                       /|\\
                       / \\
                    """;
            default -> "Something went wrong";
        };
    }
}