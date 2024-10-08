import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        int count = 0;

        for (String string : strs) {
            if (str.equals(string)) {
                count++;
            }
        }

        System.out.println(count);

    }
}