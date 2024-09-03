import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int[] arr = new int[10];

     for(int i=0;i<arr.length;i++){
         arr[i]  = scanner.nextInt();
     }

     int sum = 0;
     int count=0;
     for(int i=0;i<arr.length;i++){
        if(arr[i] % 3 == 0){
            sum +=arr[i];
            count++;
        }
     }
     int sum1 =0;
     for (int i=2;i<=arr.length;i+=2){
          sum1+=i;
     }


     double avg = (double) sum / count;
     System.out.print(sum1+" ");
     System.out.printf("%.1f",avg);

  }
}