package GoormLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 여기선 출력 잘됨
// 구름 IDE에서는 출력값이 이상함...왜?
public class GR_뱀이지나간자리_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ex. 3 3
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        // 세로 길이
        int a = Integer.parseInt(st.nextToken());
        // 가로 길이
        int b = Integer.parseInt(st.nextToken());

        for(int i=1; i<=a; i++){
            if(a%2!=0){
                for(int j=1; j<=b; j++){
                    System.out.print("#");
                }
                System.out.println();
            } else {
                for(int k=1; k<=b; k++){
                    if(k<b){
                        System.out.print(".");
                    } else {
                        System.out.print("#");
                    }
                    //System.out.println();
                }
            }
        }
    }
}
