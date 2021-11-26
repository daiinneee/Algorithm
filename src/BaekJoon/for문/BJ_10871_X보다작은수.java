package BaekJoon.for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10871_X보다작은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        int a;

        // ex. 1 10 4 9 2 3 8 5 7 6
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        for(int i=0; i<n; i++){
            if(arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
