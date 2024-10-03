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
        System.out.println(str);

    }

}