package BackJoon.if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2884_알람시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int h = Integer.parseInt(st.nextToken()); // 시
        int m = Integer.parseInt(st.nextToken()); // 분

        if(m<45){
            h--;
            m = 60 - (45-m);
            // 만약 입력이 0 30이면
            // 0--; -> h가 -1이 나오기 때문에 이 경우는 h를 23으로 수정해줌
            if(h < 0){
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            m = m - 45;
            System.out.println(h + " " + m);
        }
    }
}
