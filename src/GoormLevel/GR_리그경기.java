package GoormLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GR_리그경기 {
    /*
    2팀이면 1경기 -> 1
    3팀이면 3경기 -> 1+2
    4팀이면 6경기 -> 1+2+3
    1~(팀의 수-1)까지 다 더하면 됨
     */

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // 리그에 참여하는 팀의 수
        int n = Integer.parseInt(input);
        int sum = 0;

        // ex. 10 -> 1+2+...+9
        for(int i=1; i<n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
