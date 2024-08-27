import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

         for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        bubble_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }



    private static void bubble_sort(int[] arr){
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length-i-1;j++){
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
    }


}