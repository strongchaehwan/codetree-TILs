import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] c = str.toCharArray();
        char fisrtC = c[0]; // c
        char secC = c[1];

        for (int i = 0; i < str.length(); i++) {
            if (c[i] == fisrtC) {
                c[i] = secC;
            } else if (c[i] == secC) {
                c[i] = fisrtC;
            }
        }

        String newString = String.valueOf(c);
        System.out.println(newString);

    }

}