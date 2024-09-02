import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = new char[10];
        for (int i = 0;i<chars.length;i++){
            if(chars[i] == ' '){
                continue;
            }
            chars[i] = scanner.next().charAt(0);
        }
        //System.out.println(Arrays.toString(chars));

        for(int i=chars.length-1;i>=0;i--){
            System.out.print(chars[i]);
        }

    }
}