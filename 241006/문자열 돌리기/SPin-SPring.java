import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(str);

        for (int i = 0; i < 5; i++) {

            str = str.substring(str.length() - 1, str.length()) + str.substring(0, str.length() - 1);
            System.out.println(str);
        }

    }

}