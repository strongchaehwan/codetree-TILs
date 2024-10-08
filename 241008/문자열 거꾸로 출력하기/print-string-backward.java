import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        for (int i = 0; i < 10; i++) {
            str = sc.next();
            if (str.equals("END")) {
                break;
            }

            for (int j = str.length() - 1; j >= 0; j--) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }

    }
}