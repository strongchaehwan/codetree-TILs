import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int method = method(n, m);
        System.out.println(method);

    }

    private static int method(int n, int m) {
        return n * m / gcd(n, m);
    }

    private static int gcd(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }

        return n;
    }

}