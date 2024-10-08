import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[200];
        int count = 0;

        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.next();
            if (strs[i].equals("0")) {
                break;
            }
            count++;
        }

        System.out.println(count);

        for (int i = 0; i < count; i = i + 2) {
            System.out.println(strs[i]);
        }

    }
}