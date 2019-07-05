import java.util.Scanner;

class PrintFlowerNumber {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String[][] flowerNum = new String[10][5];

        flowerNum[0] = new String[]{"＊＊＊",
                                    "＊　＊",
                                    "＊　＊",
                                    "＊　＊",
                                    "＊＊＊"};
        flowerNum[1] = new String[]{"　　＊",
                                    "　　＊",
                                    "　　＊",
                                    "　　＊",
                                    "　　＊"};
        flowerNum[2] = new String[]{"＊＊＊",
                                    "　　＊",
                                    "＊＊＊",
                                    "＊　　",
                                    "＊＊＊"};
        flowerNum[3] = new String[]{"＊＊＊",
                                    "　　＊",
                                    "＊＊＊",
                                    "　　＊",
                                    "＊＊＊"};
        flowerNum[4] = new String[]{"＊　＊",
                                    "＊　＊",
                                    "＊＊＊",
                                    "　　＊",
                                    "　　＊"};
        flowerNum[5] = new String[]{"＊＊＊",
                                    "＊　　",
                                    "＊＊＊",
                                    "　　＊",
                                    "＊＊＊"};
        flowerNum[6] = new String[]{"＊＊＊",
                                    "＊　　",
                                    "＊＊＊",
                                    "＊　＊",
                                    "＊＊＊"};
        flowerNum[7] = new String[]{"＊＊＊",
                                    "　　＊",
                                    "　　＊",
                                    "　　＊",
                                    "　　＊"};
        flowerNum[8] = new String[]{"＊＊＊",
                                    "＊　＊",
                                    "＊＊＊",
                                    "＊　＊",
                                    "＊＊＊"};
        flowerNum[9] = new String[]{"＊＊＊",
                                    "＊　＊",
                                    "＊＊＊",
                                    "　　＊",
                                    "＊＊＊"};

        System.out.print("数字を入力してください：");
        String[] strArray = stdIn.next().split("");

        for (int i = 0; i < 5; i++) {
            for (String s : strArray) {
                System.out.print(flowerNum[Integer.parseInt(s)][i] + " ");
            }
            System.out.println();
        }
        // 出力行ごとに格納してから出力
        /*
        String[] strOut = {"", "", "", "", ""};
        for (String s : strArray) {
            for (int i = 0; i < 5; i++){
                strOut[i] += (flowerNum[Integer.parseInt(s)][i] + " ") ;
            }
        }

        for (String s : strOut) {
            System.out.println(s);
        }
        */
        stdIn.close();
    }
}
