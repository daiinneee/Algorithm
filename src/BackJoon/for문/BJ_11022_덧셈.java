package BackJoon.for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11022_덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int t = Integer.parseInt(input);
        String input2;
        StringTokenizer st;
        int a;
        int b;
        String arr[] = new String[t];

        for(int i=0; i<t; i++){
            input2 = br.readLine();
            st = new StringTokenizer(input2);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr[i] = (a + " + " + b +" = " + (a+b));
        }

        for(int i=0; i<t; i++){
            System.out.println("Case #" + (i+1) + ": " + arr[i]);
        }
    }
}
