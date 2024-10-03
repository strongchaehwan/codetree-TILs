import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (i % 2 != 0 || i == 1) {
                if (i == 0) {
                    break;
                }
                System.out.print(str.charAt(i));
            }

        }

    }

}