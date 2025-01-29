import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int result = method(sum);
        System.out.println(result);

    }

    private static int method(int sum) {
        return sum / 10;

    }


}