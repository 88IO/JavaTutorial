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
            }
        }
    }
}
