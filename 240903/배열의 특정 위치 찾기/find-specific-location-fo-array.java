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


     for(int i = 2; i<=arr.length; i+=3){ //3 6
            sum +=arr[i];
            count++;
     }
     double avg = (double) sum / count;

     int sum2 = 0;
     for(int i=1;i<arr.length;i+=2){
         sum2+=arr[i];
     }


     System.out.print(sum2+" ");
     System.out.printf("%.1f",avg);

  }
}