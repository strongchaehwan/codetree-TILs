import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = str1 + str2;
        String str4 = str2 + str1;
        int a = Integer.parseInt(str3) + Integer.parseInt(str4);
        System.out.println(a);

    }
}