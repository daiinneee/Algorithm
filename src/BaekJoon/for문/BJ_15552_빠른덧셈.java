package BaekJoon.for문;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_15552_빠른덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(br.readLine());과 같음
        String input = br.readLine();
        int n = Integer.parseInt(input);
        StringTokenizer st;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            // write 한다고 해서 바로바로 출력되지 않음
            // 직접 출력 stream에 반영되는 것이 아니라 성능을 위해 buffer에 저장해두었다가
            // BufferedWriter가 flush 되거나 close 되었을 때 한번에 출력 stream에 반영
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) +  "\n");
        }
        br.close();

        bw.flush();
        // close는 stream을 닫아버리기 때문에 계속 출력하고자 한다면 flush 사용
        bw.close();
    }
}
