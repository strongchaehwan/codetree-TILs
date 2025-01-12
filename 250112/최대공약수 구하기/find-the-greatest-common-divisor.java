import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        getGreatest(n, m);

    }

    private static void getGreatest(int n, int m) {
        int gcd = 0;

        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }
}