import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] c = str.toCharArray();
        int q = scanner.nextInt();
        // String[] strs = new String[q];

        for (int i = 0; i < q; i++) {
            int num = scanner.nextInt();

            if (num == 1) {
                int q1 = scanner.nextInt() - 1;// 1
                int q2 = scanner.nextInt() - 1;// 2

                char temp = c[q1];
                c[q1] = c[q2];
                c[q2] = temp;

                // strs[i] = new String(c);
                String newString = String.valueOf(c);
                System.out.println(newString);
            } else if (num == 2) {
                char c1 = scanner.next().charAt(0);
                char c2 = scanner.next().charAt(0);
                for (int j = 0; j < c.length; j++) {
                    if (c[j] == c1) {
                        c[j] = c2;
                    }
                }
                String newString = String.valueOf(c);
                System.out.println(newString);
            }
        }
        // for (String string : strs) {
        // System.out.println(string);
        // }

    }

}