import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    private static int[] numbers = new int[15];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item ;
        randomnumber();
        printnumber();
        //System.out.printf("%nput your number here :");
        // int input = sc.nextInt();

        for(int i = 0 ;i <numbers.length ; i++ ){

            System.out.printf("%nput your number here :");
            int input = sc.nextInt();

            if(numbers[i] == input ) {

                System.out.printf("%nwe found the number " + numbers[i] + "at the index" + i);

            }else if(numbers[i] != input ){
                System.out.println(" try again");
            }

        }

    }

    private static void randomnumber(){
        Random randomnumbers = new Random(12);
        for(int i = 1 ; i < numbers.length ; i++){

            numbers[i] = randomnumbers.nextInt(100);

        }

    }
    private static void printnumber(){
        // how to for each
       for(int i : numbers){
           System.out.print(i + " ");
       }

    }

}



