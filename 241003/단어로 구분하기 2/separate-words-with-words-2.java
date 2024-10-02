import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 || i == 0) {
                System.out.println(arr[i]);
            }
        }

    }

}