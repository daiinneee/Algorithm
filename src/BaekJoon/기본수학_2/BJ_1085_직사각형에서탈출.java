package BaekJoon.기본수학_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1085_직사각형에서탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int x = Integer.parseInt(st.nextToken()); // 6
        int y = Integer.parseInt(st.nextToken()); // 2
        int w = Integer.parseInt(st.nextToken()); // 10
        int h = Integer.parseInt(st.nextToken()); // 3

        // x, y, h-y, w-x 4개중 최솟값 찾으면 됨
        int xMin = Math.min(x, y);
        int yMin = Math.min(w-x, h-y);

        System.out.println(Math.min(xMin, yMin));
    }
}
