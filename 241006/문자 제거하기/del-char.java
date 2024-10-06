import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        // char[] chars = str.toCharArray();

        while (true) {
            int index = scanner.nextInt();
            if (index > str.length()) {
                System.out.println(str.charAt(0));
                break;
            } else {
                str = str.substring(0, index) + str.substring(index + 1, str.length());
                System.out.println(str);
            }

            // System.out.println(str);
        }

    }

}