package Java;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        Practice();

    }

    static void Practice(){
        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.remove(1);
        System.out.println(array.get(1));
        String new_array = Arrays.toString(array.toArray());
        System.out.println(new_array);

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));






    }
}
