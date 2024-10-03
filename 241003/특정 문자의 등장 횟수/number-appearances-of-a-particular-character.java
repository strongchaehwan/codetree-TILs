import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int eecount = 0;
        int ebcount = 0;

        if (str.contains("ee")) {
            eecount++;
        }
        if (str.contains("eb")) {
            ebcount++;
        }

        System.out.println(eecount + " " + ebcount);

    }

}