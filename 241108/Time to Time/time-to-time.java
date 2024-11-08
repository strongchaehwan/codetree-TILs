import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//2시
        int b = scanner.nextInt();//5분
        int c = scanner.nextInt();//4시
        int d = scanner.nextInt();//1분

        int sum1 = c * 60 +d;
        int sum2 = a * 60 +b;
        System.out.println(sum1-sum2);



    }




}