import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        int count = 0;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] % 2 ==0){
                System.out.print(arr[i]+" ");
            }
        }
















    }
}