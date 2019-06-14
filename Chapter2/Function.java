// 外部機能のインポート
import java.util.Scanner;

// ２次方程式 f(x) = ax^2 + bx + c
class QuadraticEqu {
    final long a, b, c;

    // 係数の格納
    public QuadraticEqu(long a, long b, long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // 計算結果を返却
    public long calc(long n) {
        return (long)(a * Math.pow(n, 2) + b * n + c);
    }
}

// ２次方程式の導関数 f'(x) = 2ax + b
class Derivada {
    final long a, b;

    // 係数の格納(引数に２次方程式のクラスを投げる)
    public Derivada(QuadraticEqu f) {
        this.a = f.a * 2;
        this.b = f.b;
    }

    // 計算結果を返却
    public long calc(long n) {
        return a * n + b;
    }
}

// メインクラス
class Function {
    public static void main(String[] args) {
        //　入力値の格納
        Scanner stdIn = new Scanner(System.in);

        System.out.println("関 数 f(x) = ax ^2 + bx + c を 生 成 し ま す 。");
        System.out.print("a: ");
        long a = stdIn.nextLong();
        System.out.print("b: ");
        long b = stdIn.nextLong();
        System.out.print("c: ");
        long c = stdIn.nextLong();
        System.out.println("f(n) と f’(n) を 計 算 し ま す 。");
        System.out.print("n: ");
        long n = stdIn.nextLong();

        // ２次方程式を定義
        QuadraticEqu f = new QuadraticEqu(a, b, c);

        // f(n)を計算
        System.out.println(String.format("f(%d) = %d", n, f.calc(n)));
        // f'(n)を計算
        System.out.println(String.format("f'(%d) = %d", n, new Derivada(f).calc(n)));
    }
}

