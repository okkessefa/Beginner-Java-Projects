import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String playAgain;

        System.out.println("********************");
        System.out.println("Welcome to Slot Game");
        System.out.println("********************");

        while(balance>0){
            System.out.println("Current balance : $" + balance);
            System.out.print("Palce your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();
            if(bet>balance){
                System.out.println("Insufficient amount");
                continue;
            }else if(bet <= 0){
                System.out.println("Bet amount should be bigger than 0");
                continue;
            }else{
                balance-=bet;
            }
            System.out.println("Spinning...");
            String[] row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);
            if(payout>0){
                System.out.println("You won $"+ payout);
                balance += payout;
            }else{
                System.out.println("Sorry , you lost");
            }

            System.out.print("Do you want to play again (Y or N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }

        }
        System.out.println("Thank you for playing.");

    }
    static String[] spinRow(){

        String[] shapes = {"🥚", "🍗", "🍬", "🧊", "🍷"};
        String[] row = new String[3];

        Random random = new Random();

        for(int i = 0 ; i < 3; i++){
            row[i] = shapes[random.nextInt(shapes.length)];
        }
        // System.out.println(row[0] + row[1] + row[2]);

        return row;
    }
    static void printRow(String[] row){
        System.out.println("********************");
        System.out.println(" "+ String.join(" | ", row));
        System.out.println("********************");

    }
    static int getPayout(String[] row, int bet){

        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🥚" -> bet * 3;
                case "🍗" -> bet * 6;
                case "🍬" -> bet * 9;
                case "🧊" -> bet * 12;
                case "🍷" -> bet * 15;
                default -> 0;
            };
        }

        else if (row[0].equals(row[1])){
            return switch(row[0]){
                case "🥚" -> bet * 2;
                case "🍗" -> bet * 3;
                case "🍬" -> bet * 4;
                case "🧊" -> bet * 5;
                case "🍷" -> bet * 6;
                default -> 0;
            };
        }

        else if (row[1].equals(row[2])){
            return switch(row[0]){
                case "🥚" -> bet * 2;
                case "🍗" -> bet * 3;
                case "🍬" -> bet * 4;
                case "🧊" -> bet * 5;
                case "🍷" -> bet * 6;
                default -> 0;
            };
        }
        return 0;
    }
}
