package BackJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

   /*
   풀이
   1. 현재 인덱스의 왼쪽에서 가장 높은 건물의 높이를 구한다.
   2. 현재 인덱스의 오른쪾에서 가장 높은 건물의 높이를 구한다.
   3. 그중 더 낮은 건물의 높이를 구한다.
   4. 3번에서 구한 높이에서 현재 인텍스에 있는 건물의 높이를 뺀다.
   5. 위의 과정을 1번째, 마지막을 제외하고 현재 인덱스에서 담길 수 있는 빗물의 양을 합합다.
   => 더 큰 건물들 사이에 끼어 있으면 빗물이 담긴다.
    */
public class BJ_14719_빗물 {

    // 정적 변수
    static int[] map;
    static int ret, left, right;

    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력 : 4 8
        // new StringTokenizer(문자열); -> 띄어쓰기 기준으로 문자열을 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 세로 길이
        int H = Integer.parseInt(st.nextToken());
        // 가로 길이
        int W = Integer.parseInt(st.nextToken());
        // 가로 길이랑 같은 크기의 배열 생성
        map = new int[W];
        ret = left = right = 0;

        // 입력 : 3 1 2 3 4 1 1 2
        st = new StringTokenizer(br.readLine());
        // 가로 길이 만큼 반복
        for (int i = 0; i < W; i++) {
            int N = Integer.parseInt(st.nextToken());
            // ex. map 배열 인덱스 0번에 3넣기
            // 최종 : map 배열에 3 1 2 3 4 1 1 2
            map[i] = N;
        }

        // 인덱스마다 모이는 빗물 계산 ( 1번째 기둥과 마지막 기둥의 위치는 제외 )
        // 인덱스 1번과 7번은 첫번째 기둥과 마지막 기둥임
        for (int i = 1; i < W - 1; i++) {
            left = right = 0;
            // 왼쪽에서 가장 높은 건물의 높이
            for (int j = 0; j < i; j++) {
                left = Math.max(map[j], left);
            }
            // 오른쪽에서 가장 높은 건물의 높이
            for (int j = i + 1; j < W; j++) {
                right = Math.max(map[j], right);
            }
            // 더 낮은 건물을 기준으로 현재 인덱스에 모이는 빗물
            if (map[i] < left && map[i] < right) {
                ret += Math.min(left, right) - map[i];
            }
        }
        // 출력 : 5
        System.out.println(ret);
    }
}

