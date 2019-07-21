class Permutation {
    public static void main(String[] args) {
        printCombination(2);
    }

    static void printCombination(int e) {
        if (e > 1) {
            printCombination(2, e, new StringBuilder("1"));
        } else {
            System.out.println(e);
        }
    }
    static void printCombination(int n, int e, StringBuilder strElm) {
        System.out.println(n);
        System.out.println(strElm.length());
        for (int i = 0; i < strElm.length(); i++) {
            if (n == e) {
                System.out.println(strElm);
            } else {
                strElm.insert(i, String.valueOf(n));
                printCombination(n + 1, e, strElm);
            }
        }
    }
}
