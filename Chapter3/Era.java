// 外部機能のインポート
import java.util.Scanner;

class Era {
    public static void main(String[] args) {
        // 入力
        Scanner stdIn = new Scanner(System.in);
        System.out.print("1900年〜2018年の間で年を入力してください：");
        int year = stdIn.nextInt();

        // 西暦に合わせて和暦変換
        if (year < 1912) {
            System.out.println("西暦"+year+"年は明治"+(year-1867)+"年です");
        } else if (year < 1926) {
            System.out.println("西暦"+year+"年は大正"+(year-1911)+"年です");
        } else if (year < 1989){
            System.out.println("西暦"+year+"年は昭和"+(year-1925)+"年です");
        } else {
            System.out.println("西暦"+year+"年は平成"+(year-1988)+"年です");
        }
    }
}
