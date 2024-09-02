import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] score = new int[4];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j = 0;j<4;j++){
                score[j] = scanner.nextInt();
            }

            int sum = 0;
            for(int j = 0;j<4;j++){
                sum += score[j];
            }

            double avg = (double) sum /4;
            if (avg >= 60){
                System.out.println("pass");
                count++;
            }else{
                System.out.println("fail");
            }
        }

        System.out.println(count);






    }
}