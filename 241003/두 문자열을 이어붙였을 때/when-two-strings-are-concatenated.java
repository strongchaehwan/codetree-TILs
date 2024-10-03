import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        String result = str1 + str2;
        String reverseResult = str2 + str1;

        if (result.equals(reverseResult)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}