import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count=0;
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] > 250){
                break;
            }else{
                sum +=arr[i];
                count++;
            }
        }
        double avg = (double) sum/count;

        System.out.print(sum+" ");
        System.out.printf("%.1f",avg);
    }
}