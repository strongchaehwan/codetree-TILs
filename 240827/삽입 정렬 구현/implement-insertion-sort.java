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
        insert_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }



    private static void insert_sort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i -1;
            while( j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; //arr[j] < key
        }
    }


}