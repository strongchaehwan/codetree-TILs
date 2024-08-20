import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        print(num1,num2);

    }
    static void print(int num1,int num2){
       for (int i=0;i<num1;i++){
           for(int j=0;j<num2;j++){
               System.out.print("1");
           }
           System.out.println();
       }
    }
}