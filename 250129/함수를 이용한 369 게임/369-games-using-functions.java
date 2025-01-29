import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++) {
            if (method(i)) {
                count++;
            }
        }

        System.out.println(count);


    }

    private static boolean method(int i) {
        return i % 3 == 0 || gameMethod(i);
    }

    private static boolean gameMethod(int i) {
        String string = String.valueOf(i);
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (c == '3' || c == '6' || c == '9') {
                return true;
            }
        }
        return false;
    }


}