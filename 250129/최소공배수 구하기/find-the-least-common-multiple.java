import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        greatest(a, b);
    }

    private static void greatest(int a, int b) {
        //gcd = 최대공약수
        //최소 공배수는 a * b / gcd 한값이 최소공배수
        int gcd = 0;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }

        }
        System.out.println(a * b / gcd);
    }
}