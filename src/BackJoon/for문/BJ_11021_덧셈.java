package BackJoon.for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class BJ_11021_덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int t = Integer.parseInt(input);
        StringTokenizer st;
        String input2;
        int a;
        int b;
        int arr[] = new int[t];

        for(int i=0; i<t; i++){
           input2 = br.readLine();
           st = new StringTokenizer(input2);
           a = Integer.parseInt(st.nextToken());
           b = Integer.parseInt(st.nextToken());
           arr[i] = a+b;
        }

        for(int i=0; i<t; i++){
            System.out.println("Case #" + (i+1) + ": " + arr[i]);
        }
    }
}
