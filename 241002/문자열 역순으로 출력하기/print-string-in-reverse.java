import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }

        for (int i = 3; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

}