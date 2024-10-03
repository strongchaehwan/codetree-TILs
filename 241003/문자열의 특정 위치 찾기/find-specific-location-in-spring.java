import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);

        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                System.out.println(i);
                break;
            } else
                cnt++;
        }

        if (cnt == str.length()) {
            System.out.println("No");

        }

    }

}