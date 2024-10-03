import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();

        int cnt = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (cnt >= n) {
                break;
            }
            System.out.print(str.charAt(i));
            cnt++;

        }

    }

}