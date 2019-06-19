// 外部機能のインポート
import java.util.Scanner;

class TimeCalculater {
    public static void main(String[] args) {
        // 入力値を格納
        Scanner stdIn = new Scanner(System.in);
        System.out.print("時間を秒で入力してください：");
        long clock = stdIn.nextLong();

        // 時間・分・秒を格納
        int hours = (int)(clock / 3600);
        // 取得秒数を１時間未満に更新
        clock %= 3600;

        int minutes = (int)(clock / 60);
        int seconds = (int)(clock % 60);

        // ２桁固定で出力
        System.out.println(String.format("%02d時間%02d分%02d秒です", hours, minutes, seconds));
    }
}
