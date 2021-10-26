package Programmers;

import java.util.LinkedList;
import java.util.Queue;

/* Queue 사용 */
public class PG_프린터_2 {

    // input으로 들어오는 priorities를 locations과 묶어 Task로 정의
    // 이 Task는 순서대로 Queue에 넣음
    class Task {

        // 대기목록 몇 번째에 있는지 알려주는 변수
        int location;
        // 문서의 중요도를 알려주는 변수
        int priority;

        // 생성자
        public Task(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        // 큐 선언
        Queue<Task> queue = new LinkedList<>();

        /*
        for(int n : priorities){
            queue.offer(n);
        }
        */

        // priorities 배열 : 중요도가 담긴 배열
        for(int i=0; i<priorities.length; i++){
            queue.add(new Task(i, priorities[i]));
        }

        int now = 0;

        /*
        Queue에서 가장 앞에 위치한 Task를 뽑아낸 뒤,
        큐에 남아있는 Task를 확인해 방금 뽑은 Task보다
        더 높은 우선순위를 가진 작업이 존재하는지 확인
        1. 더 높은 우선순위의 작업이 큐에 존재하면 다시 큐에 넣는다
           (큐를 사용하기 때문에 맨 뒤로 들어감)
        2. 뽑은 Task가 가장 큰 우선순위라면 다시 큐에 넣지 않고 인쇄하는데,
           찾던 요청이면 순서를 출력하고 종료료
        */
        while(!queue.isEmpty()){
            // Queue에서 가장 앞에 위치한 Task 뽑기
            Task cur = queue.poll();
            // flag 변수 선언
            boolean flag = false;
            for(Task t : queue){
                if(t.priority > cur.priority){
                    flag = true;
                }
            }
            // if(true) / 조건이 true면 아래 코드 실행
            if(flag) { // 우선순위 높은게 있으면 뒤로 보낸다
                queue.add(cur);
            } else {
                now++;
                if(cur.location == location) {
                    answer = now;
                    break;
                }

            }
        }
        return answer;
    }
}
