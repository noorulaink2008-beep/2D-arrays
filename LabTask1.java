import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3, cols = 4;
        int[][] arr = new int[rows][cols];

        // Input the array
        System.out.println("Enter 3x4 integer array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Find row with maximum sum
        int maxRowSum = Integer.MIN_VALUE, maxRowIndex = -1;
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            if (sum > maxRowSum) {
                maxRowSum = sum;
                maxRowIndex = i;
            }
        }

        // Find column with maximum sum
        int maxColSum = Integer.MIN_VALUE, maxColIndex = -1;
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += arr[i][j];
            }
            if (sum > maxColSum) {
                maxColSum = sum;
                maxColIndex = j;
            }
        }

        System.out.println("Row with maximum sum: " + (maxRowIndex + 1));
        System.out.println("Column with maximum sum: " + (maxColIndex + 1));
    }
}
