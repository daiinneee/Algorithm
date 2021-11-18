package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GR_계산기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ex. 10 + 5
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());
        char b = st.nextToken().charAt(0);
        int c = Integer.parseInt(st.nextToken());

        // System.out.println(a); // 10
        // System.out.println(b); // +
        // System.out.println(c); // 5

        switch (b){
            case '+':
                System.out.println(a+c);
                break;
            case '-':
                System.out.println(a-c);
                break;
            case '*':
                System.out.println(a*c);
                break;
            case '/':
                double result = (double)a/(double)c;
                double result1 = (Math.round(result*100)/100.0);
                System.out.println(result1);
                break;
            default :
                System.out.println("지원하지 않는 연산자입니다.");
                break;
        }
    }
}
