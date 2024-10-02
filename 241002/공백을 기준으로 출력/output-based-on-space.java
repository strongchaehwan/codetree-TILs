import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = scanner.nextLine();

        String result = str.replaceAll(" ", "") + str2.replaceAll(" ", "");
        System.out.println(result);

    }

}