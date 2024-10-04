import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] c = str.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (i == 1 || i == str.length() - 2) {
                c[i] = 'a';
            }
        }

        String newString = String.valueOf(c);
        System.out.println(newString);

    }

}