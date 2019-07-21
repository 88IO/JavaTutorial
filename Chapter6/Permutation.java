<<<<<<< HEAD
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
=======
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Permutation {
    public static void main(String[] args) {
        ArrayList<String> strArray = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        // printCombination(strArray);
        printCombination2(2, new StringBuilder("1"));
    }

    static void printCombination(ArrayList<String> strArray) { printCombination(strArray, ""); }
    static void printCombination(ArrayList<String> strArray, String pelms) {
        for (String s : strArray) {
            if (strArray.size() == 1) {
                System.out.println(pelms + s);
            } else {
                ArrayList<String> newArray = new ArrayList<>(strArray);
                newArray.remove(newArray.indexOf(s));
                printCombination(newArray, pelms + s);
            }
        }
    }

    static void printCombination2(int n, StringBuilder elems) {
        System.out.println(n);
        for (int i = 0; i < elems.length(); i++) {
            elems.insert(i, String.valueOf(n));
            if (n == 4) {
                System.out.println(elems);
            } else {
                printCombination2(n + 1, elems);
>>>>>>> ea784c626f7efb906acc031de4d523f16315d7c2
            }
        }
    }
}
