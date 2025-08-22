import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        String filePath = "words.txt";
        ArrayList<String> wordList = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while((line = reader.readLine()) != null)
            {
                wordList.add(line.trim());
            }
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong");
        }

        Random random = new Random();
        String word = wordList.get(random.nextInt(wordList.size())).toLowerCase();


        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> gameWord = new ArrayList<>();
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
            System.out.println("Total attempt count is -> " + (6-guessWrongCount));
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
