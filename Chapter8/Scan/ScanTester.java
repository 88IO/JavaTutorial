class ScanTester {
    public static void main(String[] args) {
        System.out.print("Scan Int: ");
        int i = Scan.scanInt();

        System.out.print("Scan Double: ");
        double d = Scan.scanDouble();

        System.out.print("Scan String: ");
        String s = Scan.scanString();

        System.out.println("Int: " + i);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
    }
}
