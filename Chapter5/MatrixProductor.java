import java.util.Arrays;
import java.util.Scanner;

class MatrixProductor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("m*n行列Aとn*m行列Bの積を求めます。");
        System.out.print("m: ");
        int m = stdIn.nextInt();
        System.out.print("n: ");
        int n = stdIn.nextInt();

        System.out.println("行列A");
        int[][] matrix_a = setMatrix(m, n, stdIn);
        System.out.println("行列B");
        int[][] matrix_b = setMatrix(n, m, stdIn);

        int[][] matrix_c = productMatrix(matrix_a, matrix_b);

        System.out.println(Arrays.deepToString(matrix_c));
    }

    static int[][] setMatrix(int row, int col, Scanner stdIn) {
        int[][] matrix = new int[row][col];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                System.out.print(String.format("[%d][%d]: ", r, c));
                matrix[r][c] = stdIn.nextInt();
            }
        }
        return matrix;
    }

    static int[][] productMatrix(int[][] matrix_a, int[][] matrix_b) {
        int[][] matrix_c = new int[matrix_a.length][matrix_a.length];
        for (int r = 0; r < matrix_a.length; r++) {
            for (int c = 0; c < matrix_a.length; c++) {
                for (int i = 0; i < matrix_b.length; i++) {
                    matrix_c[r][c] += matrix_a[r][i] * matrix_b[i][r];
                }
            }
        }
        return matrix_c;
    }
}
