import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }

        String str = "";

        for (String string : arr) {
            str += string;
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

    }

}