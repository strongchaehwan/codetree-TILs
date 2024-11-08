import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1 = scanner.nextInt();//2월
        int d1 = scanner.nextInt();//1일
        int m2 = scanner.nextInt();//3월
        int d2 = scanner.nextInt();//1일

        int sum = 0;
        int sum1 = 0;
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 1; i < m1; i++) {
            sum += num_of_days[i];
        }
        sum += d1;
        //System.out.println(sum);

        for (int j = 1; j < m2; j++) {
            sum1 += num_of_days[j];
        }
        sum1 += d2;
        // System.out.println(sum1);

        System.out.println((sum1 - sum)+1);


    }


}