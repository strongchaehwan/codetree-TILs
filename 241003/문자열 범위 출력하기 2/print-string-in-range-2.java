import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = str.length() - 1; i >= str.length() - n; i--) {
            System.out.print(str.charAt(i));
        }

    }

}