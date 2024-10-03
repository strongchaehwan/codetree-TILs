import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int eecount = 0;
        int ebcount = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'e') {
                eecount++;
            }

            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'b') {
                ebcount++;
            }
        }

        System.out.println(eecount + " " + ebcount);

    }

}