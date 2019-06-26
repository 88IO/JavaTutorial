// 外部機能のインポート
import java.util.Scanner;

class SearchFourNumber {
    public static void main(String[] args) {
        // 標準入力を受け取り（指定範囲外で再入力）
        Scanner stdIn = new Scanner(System.in);
        int n;
        do {
            System.out.print("4以上36以下の自然数nを入力してください n:");
            n = stdIn.nextInt();
        } while (n < 4 || n > 36);

        // 配列を出力
        printArray(n, 0);
    }

    // デフォルト引数 pelem = ""
    static void printArray(int n, int index) { printArray(n, index, ""); }
    // 合計値、配列の番号、要素の受け渡し　を引数に
    static void printArray(int n, int index, String pelem) {
        // 要素の最大値
        int imax = (n - (3 - index)) < 9 ? (n - (3 - index)) : 9;

        // 最後の要素であれば、出力して終了
        if (index == 3) {
            System.out.println("(" + pelem + imax + ")");
            return;
        }

        // 要素の最小値
        int imin = (n - 9 * (3 - index)) > 1 ? (n - 9 * (3 - index)) : 1;

        // 各値を代入してループ
        for (int i = imin; i <= imax; i++) {
            printArray(n - i, index + 1, pelem + i + ", ");
        }
    }
}
