import java.util.Scanner;

class Function {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("関数f(x)=ax^2 + bx + cを生成します。");
        int a = setNumber("a");
        int b = setNumber("b");
        int c = setNumber("c");

        System.out.println("f(n)とf'(n)を計算します。");
        int n = setNumber("n");

        System.out.println(String.format("f(%d) = %d", n, quadraticEqu(a, b, c, n)));
        System.out.println(String.format("f'(%d) = %d", n, linearEqu(a, b, n)));
    }

    static int setNumber(String s) {
        System.out.print(String.format("%s:", s));
        return scan.nextInt();
    }

    static int quadraticEqu(int a, int b, int c, int n) {
        return (int)(a * Math.pow(n, 2) + b * n + c);
    }

    static int  linearEqu(int a, int b, int n) {
        return 2 * a * n + b;
    }
}
