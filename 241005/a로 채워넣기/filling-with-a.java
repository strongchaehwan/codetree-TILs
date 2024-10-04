import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        str = str.substring(0, 1) + "a" + str.substring(2);
        str = str.substring(0, str.length() - 2) + "a" + str.substring(str.length() - 1);
        System.out.println(str);

    }

}