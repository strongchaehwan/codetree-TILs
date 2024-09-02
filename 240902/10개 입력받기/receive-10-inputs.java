import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
            if(arr[i] == 0){
                break;
            }
        }
        int sum = 0;
        int count = 0;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] !=0){
                sum +=arr[i];
                count++;
            }
        }
        System.out.print(sum+" ");
        double avg = (double) sum / count;
        System.out.printf("%.1f",avg);
    }
}