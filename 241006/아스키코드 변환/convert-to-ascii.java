import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        int n = scanner.nextInt();

        System.out.print((int) c + " ");
        System.out.println((char) n);

    }

}