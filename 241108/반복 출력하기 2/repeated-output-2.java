import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printStar(n);


    }

    private static void printStar(int n) {
        if (n == 0) {
            return;
        }
        printStar(n - 1);
        System.out.println("HelloWorld");

    }


}