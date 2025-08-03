import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int searchInteger;
        String searchString;
        boolean isFound = false;

        int[] IntegerArray = {1,5,3,7,4,9,2,8,6,0};
        String[] StringArray = {"cucumber","apple", "banana", "watermelon", "melon"};


        // For string variable
        System.out.print("Enter the name to search in list: ");
        searchString = scanner.nextLine();

        for(int i = 0; i<StringArray.length; i++){
            if(StringArray[i].equals(searchString)){
                System.out.println("Element found in at index " + i);
                isFound = true;
                break;
            }
        }

        // For integer variable
        System.out.print("Enter the name to search in list: ");
        searchInteger = scanner.nextInt();

        for(int i = 0; i<IntegerArray.length; i++){
            if(searchInteger == IntegerArray[i]){
                System.out.println("Element found in at index "+ i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not fount in the array");
        }

        scanner.close();
    }
}
