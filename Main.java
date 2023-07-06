import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Which element you want to find: ");
//        int n = in.nextInt();

        int[] arr = {1, 3, 2, 4, 5, 6, 9, 20, 23};
        int target = 20;

        int ans = LinearSearch(arr, target);

        if (ans == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + ans);
        }
    }

    static int LinearSearch(int[] arr, int n) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {

            int ele = arr[i];
            if (ele == n) {
                return i;
            }
        }

        return -1; // this line executed means not found
    }
}
