import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int k = 0;
        for (int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
            if(a[i] % 3 ==0){
                k = i;
                break;
            }
        }

        System.out.println(a[k-1]);





  }
}