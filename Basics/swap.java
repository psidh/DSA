import java.sql.Array;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        //comparison sort method
        //Bubble sort
        // if array = 1, 4, 3, 2, 5, , swap at one condition, 4 less than 3 , so swap
        // The Largest element came at the end  |  at every step the largest element shifts to right end
        // this is also known as sinking sort ||  exchange sort
        // at every loop, the right end is getting sorted automatically
        // 3, 1, 5, 4, 2
        // i , j
        // 1, 3, 5, 4, 3
        // i, j
        // 1, 3, 4, 5, 2
        // i, j,
        // 1, 3, 4, 2, 5 ( till n-1 times) [i => counter]
        // j will only check only till <= length - 1
        // in-place sorting algo,  = space complexity = O(1)
        // worst case - O(n^2)

        int[] Array = {5, 4, 3, 2,1 };
        bubble(Array);
        System.out.println(Arrays.toString(Array));


    }

    public static void bubble(int[] arr){
        boolean swapped;
        // run n-1 times

        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            for (int j = 1; j < arr.length -i ; j++) {

                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            if (!swapped){
                break;
            }

        }

    }

}


