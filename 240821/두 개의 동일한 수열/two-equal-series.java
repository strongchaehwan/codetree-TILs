import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }

        sort(arr1);
        sort(arr2);

        if (equal(n,arr1,arr2)){
            System.out.println("Yes");
        }else System.out.println("No");


    }

    private static void sort(int[] arr) {
        for (int i=0;i<arr.length;i++){
           for (int j=0;j<arr.length-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
    }

    private static boolean equal(int n, int[] arr1, int[] arr2){
        for (int i=0;i<n;i++){
            if(arr1[i] == arr2[i]){
                return true;
            }
        }
        return false;

    }

}