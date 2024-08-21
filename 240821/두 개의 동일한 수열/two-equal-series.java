import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int count = 0;

        for (int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }



        for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1.length;j++){
                if (arr1[i]==arr2[j]){
                    //System.out.println("yes");
                    count++;
                }
            }
        }

        if (count==n){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }






    }

}