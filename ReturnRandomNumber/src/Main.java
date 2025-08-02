import java.util.Random;

public class Main {
    public static void main(String[] args){

        Random random = new Random();


        int integer1;
        double double1;
        boolean boolean1;

        integer1 = random.nextInt(1, 6);
        double1 = random.nextDouble();
        boolean1 = random.nextBoolean();


        System.out.println("Random integer is: "+integer1);
        System.out.println("Random double is: "+double1);
        System.out.println("Random boolean value is: "+boolean1);

        if(boolean1){
            System.out.println(integer1 + (integer1*double1));
        }else{
            System.out.println("You get 0 point");
        }

    }
}
