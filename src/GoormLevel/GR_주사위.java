package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GR_주사위 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 합의 수 입력
        int n = Integer.parseInt(input);

        while (true) {
            if (n < 2 || n > 12) {
                System.out.println("2이상 12이하 정수를 입력해주세요");
                // 다시 입력 받고 int형으로 형변환
                input = br.readLine();
                n = Integer.parseInt(input);
            } else {
                break;
            }
        }

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == n) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
