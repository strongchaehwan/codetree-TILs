import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[8];

        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextDouble();
        }

        double sum = 0;

        for(int i=0;i<arr.length;i++){
            sum +=  arr[i];
        }

        double avg = sum / arr.length;
        System.out.printf("%.1f",avg);



    }
}