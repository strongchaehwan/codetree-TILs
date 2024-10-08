import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        String str = Integer.toString(sum);
        System.out.println(str);
        str = str.substring(1, str.length()) + str.substring(0, 1);
        System.out.println(str);

    }
}