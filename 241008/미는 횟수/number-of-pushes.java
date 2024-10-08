import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        int n = 0;
        for (int i = 0; i < str1.length(); i++) {
            str2 = str2.substring(str2.length() - 1) + str2.substring(0, str2.length() - 1);
            n++;
            if (str1.equals(str2)) {
                break;
            }
        }
        if (n == str1.length()) {
            System.out.println(-1);
        } else {
            System.out.println(n);
        }

    }
}