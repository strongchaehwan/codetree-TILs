import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        str = str.substring(1, str.length()) + str.substring(0, 1);
        System.out.println(str);

    }

}