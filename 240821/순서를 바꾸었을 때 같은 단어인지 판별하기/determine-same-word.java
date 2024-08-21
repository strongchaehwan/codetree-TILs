import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

       // sort(chars1);
       // sort(chars2);
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (equals(chars1,chars2)){
            System.out.println("Yes");
        }else System.out.println("No");




    }

    private static boolean equals(char[] chars1,char[] chars2){
        if(chars1.length == chars2.length){
            for (int i=0;i<chars1.length;i++){
            if (chars1[i] != chars2[i]){
                return false;
            }
          }
       }else return false;
        return true;

    }
    private static void sort(char[] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}