import java.util.Scanner;

class QuadraticEqu {
    final long a, b, c;

    public QuadraticEqu(long a, long b, long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public long solve(long n) {
        return (long)(a*Math.pow(n, 2) + b*n + c);
    }
}

class Derivada {
    final long a, b;

    public Derivada(QuadraticEqu f) {
        this.a = f.a*2;
        this.b = f.b;
    }

    public long solve(long n) {
        return a*n + b;
    }
}

class Function {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("関 数 f(x) = ax ^2 + bx + c を 生 成 し ま す 。");
        // input
        System.out.print("a: ");
        long a = stdIn.nextLong();
        System.out.print("b: ");
        long b = stdIn.nextLong();
        System.out.print("c: ");
        long c = stdIn.nextLong();
        System.out.println("f(n) と f’(n) を 計 算 し ま す 。");
        System.out.print("n: ");
        long n = stdIn.nextLong();

        QuadraticEqu f = new QuadraticEqu(a, b, c);

        System.out.println(String.format("f(%d) = %d", n, f.solve(n)));
        System.out.println(String.format("f'(%d) = %d", n, new Derivada(f).solve(n)));
    }
}

