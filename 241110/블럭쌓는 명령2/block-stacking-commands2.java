import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//배열의크기
        int K = scanner.nextInt(); //몇번 반복하는지
        int[] arr = new int[N];

        for (int i = 0; i < K; i++) {
            int start = scanner.nextInt();//첫번쨰로 블럭을 쌓을 배열의 인덱스
            int end = scanner.nextInt(); //마지막으로 블럭을 쌓을 배열의 인덱스

            for (int j = start; j <= end; j++) {
                arr[j] += 1;
            }
        }

        int max = 0;

        for (int q = 0; q < N; q++) {
            if (max < arr[q]) {
                max = arr[q];
            }
        }

        System.out.println(max);


    }


}