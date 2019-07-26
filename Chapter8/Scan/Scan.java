import java.util.Scanner;

class Scan {
    private static Scanner scan = new Scanner(System.in);

    static int scanInt() {
        return scan.nextInt();
    }

    static double scanDouble() {
        return scan.nextDouble();
    }

    static String scanString() {
        return scan.next();
    }
}
