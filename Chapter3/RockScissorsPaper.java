<<<<<<< HEAD
class RockScissorspaper {
    public static void main(String[] args) {

=======
// 外部機能のインポート
import java.util.Random;
import java.util.Scanner;

class RockScissorsPaper {
    public static void main(String[] args) {
        // 入力 乱数生成
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int opponent = rand.nextInt(3);

        System.out.print("じゃんけんぽん！（0-グー/1-チョキ/2-パー）：");
        int myself = stdIn.nextInt();

        // お互いの手を出力
        System.out.println("プレイヤーの手：" + num2hand(myself));
        System.out.println("コンピューターの手：" + num2hand(opponent));

        // 勝ち負けを分別　負の数はあまりが出ないので＋３
        int result = (opponent - myself + 3) % 3;

        // 結果を出力
        switch (result) {
            case 0:
                System.out.println("あいこ");
                break;
            case 1:
                System.out.println("勝ち");
                break;
            case 2:
                System.out.println("負け");
                break;
            default:
        }
    }

    // 数値から手に変換
    public static String num2hand(int n) {
        switch (n) {
            case 0:
                return "グー";
            case 1:
                return "チョキ";
            case 2:
                return "パー";
            default:
                return "0~2を入力してください";
        }
>>>>>>> origin/master
    }
}
