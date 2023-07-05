import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length; // see this

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
