import java.util.Scanner;

class Text {
    char[] t;
    public Text(char[] text) {
        this.t = text;
    }

    public char[] encode(int n) {
        for (int i=0; i<t.length; i++) {
            t[i] = (char)(Character.getNumericValue(t[i])+n);
        }
        return t;
    }
    public char[] decode(int n) {
        for (int i=0; i<t.length; i++) {
            t[i] = (char)(Character.getNumericValue(t[i])-n);
        }
        return t;
    }
}

class Code {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        char[] text = stdIn.next().toCharArray();

        final int n = 2;

        Text t1 = new Text(text);

        System.out.println(text);
        System.out.println(t1.encode(n));
    }
}
