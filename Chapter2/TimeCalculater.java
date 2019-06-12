import java.util.Scanner;

class TimeCalculater {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("時間を秒で入力してください：");
        long clock = stdIn.nextInt();

        int hours = (int)clock / 3600;
        clock %= 3600;

        int minutes = (int)clock / 60;
        int seconds = (int)clock % 60;

        System.out.println(hours+"時間"+minutes+"分"+seconds+"秒です");
        System.out.println(String.format("%02d時間%02d分%02d秒です", hours, minutes, seconds));
    }
}
