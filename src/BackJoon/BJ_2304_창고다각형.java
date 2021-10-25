package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
지붕의 높이가 최대 높이의 인덱스 구하기
지붕의 높이가 가장 높은 인덱스의 값 구하기
현재 그림에서 가장 높은 지붕의 높이 : 10
지붕의 최대 높이의 인덱스 : 8
*/
public class BJ_2304_창고다각형 {

    static int[] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n : 기둥의 개수
        // 기둥의 개수를 입력받음
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        // 1이상 1000이하
        // 배열의 인덱스 값 : 지붕의 인덱스 값
        // 값 : 지붕의 높이
        // ex. map[2] = 4, map[16] = 8
        map = new int[1001];

        // 인덱스 가장작은값, 큰값 구하고 기둥중에서 높이가 가장 큰 인덱스를 구한다.
        int max_idx = 0;
        int min_idx = 0;
        int max_hight_idx = 0;
        for(int i=0; i<n; i++) {
            // ex. 입력 : 2 4 -> 빈칸을 기준으로 문자열 쪼갬 -> 2와 4
            st = new StringTokenizer(br.readLine(), " ");
            // ex. 2
            // x : 각 기둥의 왼쪽 면의 위치 = 배열의 인덱스 값
            int x = Integer.parseInt(st.nextToken());
            // ex. 4
            // y : x의 높이 = 지붕의 높이
            int y = Integer.parseInt(st.nextToken());

            map[x] = y;
            // max_idx : 배열 인덱스 중 가장 큰 값
            max_idx = Math.max(max_idx, x);
            // min_idx : 배열 인덱스 중 가장 작은 값
            min_idx = Math.min(min_idx, x);

            // 현재 입력받은 인덱스의 값(지붕의 높이)이
            // 현재 지붕의 높이 보다 클 경우 해당 인텍스 값을 갱신시켜줌
            if(map[x] > map[max_hight_idx]){
                max_hight_idx = x;
            }
        }

        // left(좌측) -> max_hight_idx
        // ex. 높이가(2, 1), (2, 3)인 경우
        //     높이가 idx=0 h=2, idx=1 h=1일 경우 현재 idx=0의 높이가 idx=1보다 더 크므로,
        //     Math.max() 함수를 사용하여 더 큰 h 값으로 sum의 값을 더해주면서 진행
        //     그 이유는 현재 h값이 더 작을 경우 값을 더하게 되면 어떤 기둥의 윗면과 닿거나
        //     옆면에 닿아햐한다 라는 조건에 위배되기 때문
        int sum = 0;
        int h = 0;
        for(int i=min_idx; i<max_hight_idx; i++){
            h = Math.max(h, map[i]);
            sum += h;
        }

        h = 0;
        // right(우측) -> max_hight_idx
        for(int i=max_idx; i>max_hight_idx; i--){
            h = Math.max(h, map[i]);
            sum += h;
        }

        int left_sum = 0;
        int right_sum = 0;
        for(int i=0; i<map.length; i++){
            if(i < max_hight_idx){
                left_sum += map[i];
            }
        }
        for(int i=map.length-1; i>=0; i--){
            if(i > max_hight_idx){
                right_sum += map[i];
            }
        }
        System.out.println(map[max_hight_idx] + sum);
        //System.out.println("left painting: "+ left_sum + " right painting : " + right_sum + " max painting :" + map[max_hight_idx]);
    }
}