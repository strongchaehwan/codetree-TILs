import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].length();

        }

        System.out.println(sum);

    }

}