import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        int maxLength = 0;
        int minLength = 0;

        if (str1.length() > str2.length()) {
            if (str1.length() > str3.length()) {
                maxLength = str1.length();
            } else {
                maxLength = str3.length();
            }
        }

        if (str2.length() > str1.length()) {
            if (str2.length() > str3.length()) {
                maxLength = str2.length();
            } else {
                maxLength = str3.length();
            }
        }

        minLength = str1.length() < str2.length() ? str1.length() : str2.length();
        minLength = minLength < str3.length() ? minLength : str3.length();
        int result = maxLength - minLength;
        System.out.println(result);

    }
}