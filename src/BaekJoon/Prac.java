package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prac {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 : abcd efg
        String input = br.readLine();
        char[] ch = input.toCharArray();

        for(char c : ch) {
            System.out.println(c + " " + "");
        }

        // a b c d  e f g
        System.out.println();

        // 입력 : 1-22-44-55-99
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        // 1 and 22 and 44 and 55
        System.out.println(a + " and " + b + " and " + c + " and " + d);
    }
}
