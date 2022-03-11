import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    private static int[] numbers = new int[30];
    private static int BinaryCount = 0;

    public static void main(String[] args) {
        randomnumber();
        bubbleSort(numbers);
        printnumber();
        Arrays.sort(numbers);
       printnumber();
        int item = 23 ;
        System.out.println();
        System.out.println("BinraySearch found " + item + " at index " + BirnaySearch(item));
        System.out.println("BinarySearch counter for each Duration : " + BinaryCount);
    }

    public static void bubbleSort(int[] b){
        for(int i = 1 ; i < b.length ;i++){
            for(int j = 0 ; j < b.length - 1 ;j++ ){

                if(b[j] > b[j + 1]){

                    int tmp = b[j];
                    b[j] = b[j +1 ];
                    b[j + 1] = tmp;
                }
            }
        }

    }

    private static int BirnaySearch(int item) {
        int start = 0 ;
        int end = numbers.length -1 ;
        // mid = start  + (end - start)/2 ; jeppe soultion
        // keep looping ontill as long as the start is smaller than the end
        while(start <= end) {

            int mid = start + (end - start) / 2 ;
            BinaryCount++ ;
            if (numbers[mid] == item) {
                return mid;
            }
            if (numbers[mid] < item) {
                // if the middle is smaller than the item
                start = mid + 1;
            }
            if (numbers[mid] > item) {
                end = mid - 1;
            }
        }

        return -1 ;
    }

    private static void randomnumber(){
        Random randomnumbers = new Random(1337);
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
    /*
    Does SQL use binary search?
   Performance. When SQL Server uses binary search to locate an index entry, it starts by checking the middle element of the slot
     array (shown in red 02 in the example above). ... The average and worst case performance of binary search is very close to
    log2N comparisons to find the item of interest in a sorted list of N items .
     */
}
