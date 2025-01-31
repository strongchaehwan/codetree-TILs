import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int method = method(a, b);
        System.out.println(method);


    }

    private static int method(int a, int b) {
        int sum = 1;
        for (int i = 0; i < b; i++) { //0,1,2,3
            sum *= a;
        }

        return sum;
    }


}