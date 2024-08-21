import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2 * n];

        for (int i=0;i<2*n;i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);

        int maxNum= 0;
        for (int i=0;i<n;i++){
            int sum = arr[i] + arr[2*n-i-1];
            if(sum > maxNum){
                maxNum=sum;
            }
        }
        System.out.println(maxNum);

    }
    private static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}