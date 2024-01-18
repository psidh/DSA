package Java;

import java.util.Arrays;

public class IntMethods {

    public static void main(String[] args) {
        System.out.println("name");
        intMethod();
    }

    static void intMethod() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = array.length;

        int element = array[2];

        array[1] = 0;
        System.out.println(Arrays.toString(array));  // Correct way to print array

        int[] new_array = Arrays.copyOf(array,4);

        System.out.println(Arrays.toString(new_array));  // Correct way to print array
    }
}
