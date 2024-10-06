import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        // char[] chars = str.toCharArray();

        while (true) {
            int index = scanner.nextInt();
            if (index > str.length()) {

                str = str.substring(0, str.length() - 1);
                System.out.println(str);
                if (str.length() == 1) {
                    break;
                }
            } else {
                str = str.substring(0, index) + str.substring(index + 1, str.length());
                System.out.println(str);
                if (str.length() == 1) {
                    break;
                }
            }

            // System.out.println(str);
        }

    }

}