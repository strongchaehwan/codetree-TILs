import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        char[] c = str1.toCharArray();
        char[] c1 = str2.toCharArray();
        c1[0] = c[0];
        c1[1] = c[1];
        String newString = String.valueOf(c1);
        System.out.println(newString);

    }

}