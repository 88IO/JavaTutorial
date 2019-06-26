// 外部機能のインポート
import java.util.Scanner;

 class PrintPyramid {
    public static void main(String[] args) {
        // 標準入力を受け取り
        Scanner stdIn = new Scanner(System.in);

        System.out.print("n段のピラミッドを出力します n:");
        int n = stdIn.nextInt();

        System.out.println();

        // ピラミッドを出力
        for (int i = 1; i <= n; i++) {
            printNstr(" ", n - i);
            printNstr("*", 2 * i -1);
            printNstr(" ", n - i);
            System.out.println();
        }

        System.out.println();
    }

    // 連続文字の出力
    static void printNstr(String m, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(m);
        }
    }
 }
