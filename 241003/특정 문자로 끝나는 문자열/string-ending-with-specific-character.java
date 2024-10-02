import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }
        char c = scanner.next().charAt(0);
        // arr[9] 에는 문자하나
        int NoneCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == c) {
                System.out.println(arr[i]);
            } else {
                NoneCount++;
            }
        }
        if (NoneCount == arr.length) {
            System.out.println("None");
        }

    }

}