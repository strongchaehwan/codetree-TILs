import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];

        for (int i=0;i<n;i++){
            str[i] = sc.nextLine();
        }

        for (int i=0;i<str.length;i++){
            for(int j=0;j<str.length-i-1;j++){
                if (str[j].compareTo(str[j+1])>0){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;

                }
            }
        }

        for (String s : str) {
            System.out.println(s);
        }

//        for (int i=0;i<str.length;i++){
//            System.out.println(str[i]);
//        }

//        for (int i=0;i<chars.length;i++){
//            for (int j=0;j< chars.length-i-1;j++){
//                if (chars[j]>chars[j+1]){
//                    char ch = chars[j];
//                    chars[j] = chars[j+1];
//                    chars[j+1] = ch;
//                }
//
//            }
//        }
//
//        for (char c : chars) {
//            System.out.print(c);
//        }





    }

}