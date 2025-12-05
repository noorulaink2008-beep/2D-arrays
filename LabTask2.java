import java.util.Scanner;

public class LabTask2 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3, cols = 4;
        int[][] arr = new int[rows][cols];

        System.out.println("Enter 3x4 integer array:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = sc.nextInt();

        // Count primes in rows
        int maxRowPrimes = 0, maxRowIndex = -1;
        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j < cols; j++)
                if (isPrime(arr[i][j])) count++;
            if (count > maxRowPrimes) {
                maxRowPrimes = count;
                maxRowIndex = i;
            }
        }

        // Count primes in columns
        int maxColPrimes = 0, maxColIndex = -1;
        for (int j = 0; j < cols; j++) {
            int count = 0;
            for (int i = 0; i < rows; i++)
                if (isPrime(arr[i][j])) count++;
            if (count > maxColPrimes) {
                maxColPrimes = count;
                maxColIndex = j;
            }
        }

        if (maxRowPrimes >= maxColPrimes)
            System.out.println("Row with maximum prime numbers: " + (maxRowIndex + 1));
        else
            System.out.println("Column with maximum prime numbers: " + (maxColIndex + 1));
    }
}
