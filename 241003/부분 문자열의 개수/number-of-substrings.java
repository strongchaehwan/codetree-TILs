import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.next();
        String targetStr = scanner.next();
        int count = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            if (i + targetStr.length() - 1 >= inputStr.length()) {
                continue;
            }

            boolean isMatched = true;
            for (int j = 0; j < targetStr.length(); j++) {
                if (inputStr.charAt(i + j) != targetStr.charAt(j))
                    isMatched = false;
            }

            if (isMatched) {
                // 모든 문자에 대하여 매칭이 된 경우:
                count++;

            }

        }
        System.out.println(count);

    }

}