import java.util.Scanner;

public class d1d2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the 1D array: ");
        int size = scanner.nextInt();

        int[] oneDimArray = new int[size];
        System.out.println("Enter the elements of the 1D array:");
        for (int i = 0; i < size; i++) {
            oneDimArray[i] = scanner.nextInt();
        }

        System.out.println("Elements of the 1D array:");
        for (int i = 0; i < size; i++) {
            System.out.print(oneDimArray[i] + " ");
        }
        System.out.println();

        // OUTPUT
        System.out.print("Enter the number of rows for the 2D array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the 2D array: ");
        int columns = scanner.nextInt();

        int[][] twoDimArray = new int[rows][columns];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elements of the two-dimensional array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
