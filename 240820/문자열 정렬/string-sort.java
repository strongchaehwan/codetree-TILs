import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        char[] chars = string.toCharArray();

        for (int i=0;i<chars.length;i++){
            for (int j=0;j< chars.length-i-1;j++){
                if (chars[j]>chars[j+1]){
                    char ch = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = ch;
                }

            }
        }

        for (char c : chars) {
            System.out.print(c);
        }





    }

}