import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        char c = scanner.next().charAt(0);
        // arr[9] 에는 문자하나
        int count = 0;
        int sum = 0;
        int NoneCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].charAt(0) == c) {
                count++;
                sum = sum + arr[i].length();
            } else {
                NoneCount++;
            }
        }
        if (NoneCount == arr.length) {
            System.out.println("None");
        }

        System.out.printf("%d %.2f", count, (double) sum / count);

    }

}