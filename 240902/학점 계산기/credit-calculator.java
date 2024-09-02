import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextDouble();
        }

        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }

       double avg = (double) sum/n;
        System.out.printf("%.1f",avg);
        System.out.println();
       if(avg >= 4.0){
           System.out.println("Perfect");
       }if(avg >= 3.0){
            System.out.println("Good");
        }else{
            System.out.println("Poor");
        }


    }
}