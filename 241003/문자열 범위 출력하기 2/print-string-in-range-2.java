import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();

        for (int i = str.length() - 1; i > str.length() - 1 - n; i--) {
            System.out.print(str.charAt(i));
        }

    }

}