import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];// 3개 0,1,2
        scanner.nextLine();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }

        int sum = 0;
        int acount = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].length();
            if (arr[i].charAt(0) == 'a') {
                acount++;
            }
        }

        System.out.println(sum + " " + acount);

    }

}