import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        String newString = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - 'a' + 'A');
            }
        }
        for (char c : arr) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                System.out.print(c);

            }
        }

    }

}