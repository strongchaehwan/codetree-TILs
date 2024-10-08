import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String str = Integer.toString(num);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum = sum + (int) (str.charAt(i) - '0');
            }
        }

        System.out.println(sum);

    }
}