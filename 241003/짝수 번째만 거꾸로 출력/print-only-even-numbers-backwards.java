import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int index = str.length() - 1;// 마지막인덱스
        if (index % 2 == 0) {
            index--;
        }

        for (int i = index; i >= 0; i = i - 2) {
            System.out.print(str.charAt(i));
        }
    }

}