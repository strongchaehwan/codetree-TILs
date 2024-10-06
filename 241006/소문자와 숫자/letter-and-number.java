import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    || ((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57)) {
                System.out.print(str.charAt(i));
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                System.out.print((char) (str.charAt(i) - 'A' + 'a'));

            }
        }

    }
}