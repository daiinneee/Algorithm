package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Dfs_Prac_1 {
    /* 1 2 4 6 5 7 3 */
    /* 정점의 개수 N, 연결선의 개수 M, 시작 정점 1에서 DFS 방문 경로를 출력하시오 */
    /* 풀이
       시작 정점 1을 dfs() 함수 실행할 때 입력해준 뒤,
       Stack을 이용하여 다음 정점과 연결되어 있고( map[x][i]==1 )
       아직 방문하지 않은 정점이 있다면 ( visited[i] == false )
       스택에 해당 정점을 넣어주고, 더 이상 방문할 정점이 존재하지 않는다면
       pop()을 해주면서 연결되어 있는 모든 정점을 깊이 우선 탐색으로 방문하는 문제
       방문한 정점에 대하여 중복 방문하는 경우를 방지하기 위해 visited 배열을
       이용하여 방문할 경우 true 값을 이용해 중복처리 해줌
     */

    // 자바의 입력 class
    // Scanner, BufferReader, StringTokenizer
    // BufferReader, StringTokenizer는 문자열로 활용하기 위해 사용
    // StringTokenizer 클래스 : 하나의 문자열을 여러 개의 토큰으로 분리 하는 클래스
    static int[][] map;
    static boolean[] visited;
    static StringTokenizer st;
    static int N, M, start, end;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정점의 개수 입력 받기
        N = Integer.parseInt(br.readLine());
        // 연결선의 개수 입력 받기
        M = Integer.parseInt(br.readLine());

        map = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        // 그래프 정보 입력받기
        for(int m = 0; m < M; m++){
            // " " 띄어쓰기를 기준으로 문자열을 분리
            // ex. 1 3 입력
            st = new StringTokenizer(br.readLine(), " ");
            // ex. start : 1
            start = Integer.parseInt(st.nextToken());
            // ex. end : 2
            end = Integer.parseInt(st.nextToken());
            // ex. map[1][2] = 1;
            // ex. map[2][1] = 1;
            map[start][end] = 1;
            map[end][start] = 1;
        }

        System.out.println("그래프 DFS 방문 순서 : ");
        // 정점 1에서 시작
        dfs(1);
    }

    // point : 1
    static void dfs(int point){
        // DFS 이전 정점을 저장하기 위한 스택
        Stack<Integer> stack = new Stack<>();
        // 스택에 1 push
        stack.push(point);
        // static boolean[] visited = new boolean[N + 1];
        // ex. visited[1] = true;
        visited[point] = true;
        // ex. 1
        System.out.println(point + " ");

        // 스택이 공백이 될때까지 실행
        while(!stack.isEmpty()) {
            for(int i = 1; i <= N; i++){
                // 다음 정점과 연결되어 있고 아직 방문하지 않았다면
                // ex. map[1][1] == 1
                if(map[point][i] == 1 && visited[i] == false){
                    stack.push(i);
                    visited[i] = true;
                    dfs(i);
                }
            }
            stack.pop();
        }
    }
}
