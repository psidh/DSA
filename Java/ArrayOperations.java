import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        // Create an array
        int[] arr = new int[5];

        // Initialize array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // Display the array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Update an element
        arr[2] = 42;
        System.out.println("Array after updating element at index 2: " + Arrays.toString(arr));

        // Insert an element at a specific index
        int[] newArr = new int[arr.length + 1];
        int insertIndex = 3;
        int newValue = 99;

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == insertIndex) {
                newArr[i] = newValue;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        System.out.println(
                "Array after inserting " + newValue + " at index " + insertIndex + ": " + Arrays.toString(newArr));

        // Delete an element at a specific index
        int deleteIndex = 1;
        int[] newArrAfterDeletion = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != deleteIndex) {
                newArrAfterDeletion[j] = arr[i];
                j++;
            }
        }
        System.out.println(
                "Array after deleting element at index " + deleteIndex + ": " + Arrays.toString(newArrAfterDeletion));
    }
}
