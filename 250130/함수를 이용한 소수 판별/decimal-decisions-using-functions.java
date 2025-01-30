import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                if (i == 1) {
                    sum = 0;
                } else {
                    sum += i;
                }

            }
        }

        System.out.println(sum);


    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}