import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int[] arr = new int[10];

     for(int i=0;i<arr.length;i++){
         arr[i]  = scanner.nextInt();
     }

        System.out.println(arr[2]+arr[4]+arr[9]);

    }
}