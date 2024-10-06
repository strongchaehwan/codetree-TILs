import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        int n = 0;
        if (c == 'z') {
            n = 97;
        } else {
            n = c + 1;
        }
        char newC = (char) n;
        System.out.println(newC);

    }

}