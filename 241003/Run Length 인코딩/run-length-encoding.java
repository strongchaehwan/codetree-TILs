import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String encodeing = "";
        char currChar = str.charAt(0);
        int numChar = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currChar) {
                numChar++;
            } else {
                encodeing = encodeing + currChar;
                encodeing = encodeing + numChar;

                currChar = str.charAt(i);
                numChar = 1;
            }
        }
        encodeing = encodeing + currChar;
        encodeing = encodeing + numChar;
        System.out.println(encodeing.length());
        System.out.println(encodeing);

    }

}