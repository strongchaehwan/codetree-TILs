import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = method(a, b, c);
        System.out.println(result);

    }

    private static int method(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return c;
            }
            if (c >= b) {
                return b;
            }
        } else if (b >= a) {
            if (a >= c) {
                return c;
            }
            if (c >= a) {
                return a;
            }
        }
        return 0;

    }


}