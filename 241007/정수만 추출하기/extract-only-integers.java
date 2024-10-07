import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String newstr1 = "";
        String newstr2 = "";

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                newstr1 = newstr1 + String.valueOf(str1.charAt(i));
            } else {
                break;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                newstr2 = newstr2 + String.valueOf(str2.charAt(i));
            } else {
                break;
            }
        }
        int num1 = Integer.parseInt(newstr1);
        int num2 = Integer.parseInt(newstr2);
        System.out.println(num1 + num2);

    }
}