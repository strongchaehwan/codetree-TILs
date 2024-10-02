import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruit = { "apple", "banana", "grape", "blueberry", "orange" };
        char c = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].charAt(2) == c || fruit[i].charAt(3) == c) {
                count++;
                System.out.println(fruit[i]);
            }
        }
        System.out.println(count);

    }

}