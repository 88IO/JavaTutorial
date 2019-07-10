import java.util.Scanner;

class LinearSearch {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("String配列を生成します。");
        System.out.print("要素数：");
        int n = scan.nextInt();

        int result = linearSearch(generateStringArray(n));

        if (result == -1) {
            System.out.println("対象の配列にキーは存在しません");
        } else {
            System.out.println(String.format("キーは配列の%dインデックス目にあります", result));
        }
    }

    static String[] generateStringArray(int n) {
        String[] strArray = new String[n];
        System.out.println("各要素を入力してください。");
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("[%d]:", i));
            strArray[i] = scan.next();
        }

        return strArray;
    }

    static int linearSearch(String[] strArray) {
        System.out.print("キーを入力してください：");
        String word = scan.next();

        for (int i = 0; i < strArray.length; i++) {
            if (word.equals(strArray[i])) {
                return i;
            }
        }
        return -1;
    }
}
