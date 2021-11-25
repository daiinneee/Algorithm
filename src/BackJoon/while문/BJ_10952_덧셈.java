package BackJoon.while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_10952_덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringTokenizer st;
        int a;
        int b;
        List<Integer> array = new ArrayList<>();

        while(true){
            input = br.readLine();
            st = new StringTokenizer(input);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(a==0 && b==0){
                break;
            }
            array.add(a+b);
        }
        for(int i=0; i<array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
