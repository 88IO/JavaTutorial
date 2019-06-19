// 標準入力機能のインポート
import java.util.Scanner;

class Calculater {
    public static void main(String[] args) {
        // 入力
        Scanner stdIn = new Scanner(System.in);

        System.out.println("二つの整数x,yを入力してください。");

        System.out.print("x：");
        double x = stdIn.nextDouble();
        System.out.print("y：");
        double y = stdIn.nextDouble();

        // 演算方法決定
        System.out.print("どの演算を行いますか？（0-足し算/1-引き算/2-掛け算/3-割り算）：");
        int calc = stdIn.nextInt();

        // 演算＆出力
        switch (calc) {
            case 0:
                System.out.println(x + " + " + y + " = " + (x + y));
                break;
            case 1:
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case 2:
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            case 3:
                if (y == 0) {
                    System.out.println("0では割れません");
                } else {
                    System.out.println(x + " / " + y + " = " + (x / y));
                }
                break;
            default:
                System.out.println("0~3を入力してください");
                break;
        }
    }
}
