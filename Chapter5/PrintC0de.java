import java.util.Random;

class PrintC0de {
    public static void main(String[] args) {
        Random rand = new Random();
        int index;
        int preindex = -1;
        Boolean flag = false;
        String[] text = {"C", "0", "d", "e"};

        while (true) {
            index = rand.nextInt(4);
            System.out.print(text[index]);


            if (index == preindex + 1) {
                if (index == 3) {
                    System.out.println();
                    System.out.println("C0deが生成されたのでプログラムを終了します。");
                    return;
                }
                preindex = index;
            } else {
                preindex = -1;
            }
        }
    }
}
