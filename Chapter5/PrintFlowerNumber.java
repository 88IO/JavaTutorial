import java.util.Scanner;

class PrintFlowerNumber {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String[] flowerNum = new String[10];
        String[] strOut = {"", "", "", "", ""};

        flowerNum[0] = "＊＊＊" +
                       "＊　＊" +
                       "＊　＊" +
                       "＊　＊" +
                       "＊＊＊";
        flowerNum[1] = "　　＊" +
                       "　　＊" +
                       "　　＊" +
                       "　　＊" +
                       "　　＊";
        flowerNum[2] = "＊＊＊" +
                       "　　＊" +
                       "＊＊＊" +
                       "＊　　" +
                       "＊＊＊";
        flowerNum[3] = "＊＊＊" +
                       "　　＊" +
                       "＊＊＊" +
                       "　　＊" +
                       "＊＊＊";
        flowerNum[4] = "＊　＊" +
                       "＊　＊" +
                       "＊＊＊" +
                       "　　＊" +
                       "　　＊";
        flowerNum[5] = "＊＊＊" +
                       "＊　　" +
                       "＊＊＊" +
                       "　　＊" +
                       "＊＊＊";
        flowerNum[6] = "＊＊＊" +
                       "＊　　" +
                       "＊＊＊" +
                       "＊　＊" +
                       "＊＊＊";
        flowerNum[7] = "＊＊＊" +
                       "　　＊" +
                       "　　＊" +
                       "　　＊" +
                       "　　＊";
        flowerNum[8] = "＊＊＊" +
                       "＊　＊" +
                       "＊＊＊" +
                       "＊　＊" +
                       "＊＊＊";
        flowerNum[9] = "＊＊＊" +
                       "＊　＊" +
                       "＊＊＊" +
                       "　　＊" +
                       "＊＊＊";

        System.out.print("数字を入力してください：");
        String[] strArray = stdIn.next().split("");

        for (String s : strArray) {
            for (int i = 0; i < 5; i++){
                strOut[i] += (flowerNum[Integer.parseInt(s)].substring(i * 3, i * 3 + 3) + " ") ;
            }
        }

        for (String s : strOut) {
            System.out.println(s);
        }
    }
}
