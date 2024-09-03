import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int asum = 0;
        int bsum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<arr.length;i+=2){
            asum+=arr[i];
        }

        for(int i=1;i<arr.length;i+=2){
            bsum+=arr[i];
        }
        int result=0;
        if(asum > bsum){
            result = asum - bsum;
        }else{
            result = bsum - asum;
        }

        System.out.println(result);




  }
}