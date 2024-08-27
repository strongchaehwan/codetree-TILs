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
        select_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }



    private static void select_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}