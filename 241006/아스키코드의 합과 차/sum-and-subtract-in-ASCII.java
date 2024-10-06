import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c1 = scanner.next().charAt(0);
        char c2 = scanner.next().charAt(0);

        int num1 = (int) c1;
        int num2 = (int) c2;
        System.out.print(num1 + num2 + " ");
        if (num1 > num2) {
            System.out.println(num1 - num2);
        } else {
            System.out.println(num2 - num1);
        }

    }

}