import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][4];
        int[][] B = new int[4][3];
        int[][] C = new int[3][3];

        // Input matrix A
        System.out.println("Enter 3x4 matrix A:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                A[i][j] = sc.nextInt();

        // Input matrix B
        System.out.println("Enter 4x3 matrix B:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 3; j++)
                B[i][j] = sc.nextInt();

        // Multiply A and B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 4; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }

        // Display Result
        System.out.println("Resultant 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
}
