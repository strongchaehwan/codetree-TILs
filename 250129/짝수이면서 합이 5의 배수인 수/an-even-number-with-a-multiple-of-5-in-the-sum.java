import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (method(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

    private static boolean method(int n) {
        String string = String.valueOf(n);
        char c1 = string.charAt(0);
        char c2 = string.charAt(1);

        int a = c1 - '0';
        int b = c2 - '0';
        int sum = a + b;

        return n % 2 == 0 && sum % 5 == 0;
    }


}