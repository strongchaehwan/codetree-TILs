import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean leap = leap(y);
        System.out.println(leap);


    }

    private static boolean leap(int y) {
        return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
    }


}