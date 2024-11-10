import java.util.Scanner;

public class Main {
    private static final int OFFSET = 100;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[200];
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            for (int j = start; j <= end; j++) {
                arr[j] += 1;
            }
        }

        int max = 0;
        for (int k = 0; k < arr.length; k++) {
            if (max < arr[k]) {
                max = arr[k];
            }
        }

        System.out.println(max);

    }
}