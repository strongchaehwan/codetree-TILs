import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] c = str.toCharArray();
        char c1 = c[0];
        char c2 = c[1];

        for (int i = 0; i < c.length; i++) {
            if (c[i] == c2) {
                c[i] = c1;
            }
        }

        String newString = String.valueOf(c);
        System.out.println(newString);

    }

}