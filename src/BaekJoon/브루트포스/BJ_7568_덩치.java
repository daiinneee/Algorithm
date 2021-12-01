package BaekJoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
x Kg, y cm (x,y),(p,q) x>p,y>p이면 A의 덩치가 B보다 크다고 함
(45,181) (55,173) 덩치 비교 불가
 */
public class BJ_7568_덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // n행 2열
        int arr[][] = new int[n][2];

        for(int i=0; i<n; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            // ex. arr[0][0]=55 arr[0][1]=185
            arr[i][0] = h;
            arr[i][1] = w;
        }
        for(int i=0; i<n; i++){
            int rank = 1;
            for(int j=0; j<n; j++){
                // i=0, j=0 -> 같은 사람은 비교할 필요가 없음
                if(i==j) continue;
                // i번째 사람이 뒤의 j번째 사람보다 키와 몸무게가 작을 경우,
                // i번째 사람의 rank를 1 증가시켜 순위가 늘어나게 함
                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]){
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
