import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String partstr = scanner.next();
        // char[] c = partstr.toCharArray();

        if (str.contains(partstr)) {
            System.out.println(str.indexOf(partstr));
        } else
            System.out.println(-1);

    }

}