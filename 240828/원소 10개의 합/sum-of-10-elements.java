import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        System.out.println(sum);
    }
}