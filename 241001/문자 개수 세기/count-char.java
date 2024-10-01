import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char c = scanner.next().charAt(0);
        int sameCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                sameCount++;
            }
        }

        System.out.println(sameCount);

    }
}