package Programmers;

import java.util.Collections;
import java.util.PriorityQueue;

/*
- 문제 설명 -
일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄 -> 중요한 문서가 나중에 인쇄될 수 있음
이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발함
이 프린터는 아래와 같은 방식으로 인쇄 작업을 수행
1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
3. 그렇지 않으면 J를 인쇄합니다.

ex. 4개의 문서(A, B, C, D)가 순서대로 인쇄 대기목록에 있고 중요도가 2 1 3 2 라면
    C D A B 순으로 인쇄(중요도가 높을수록 먼저 인쇄!)

현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와
내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려주는 location이 매개변수로 주어질 때,
내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.

- 제한사항 -
1. 현재 대기목록에는 1개 이상 100개 이하의 문서가 있음
2. 인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻
3. location은 0이상 (현재 대기목록에 있는 작업 수 -1) 이하의 값을 가지며
   대기목록의 가장 앞에 있으면 0, 두 번째에 있으면 1로 표현
*/

/* PriorityQueue 사용 */
class PG_프린터_1 {

    public int solution(int[] priorities, int location) {
        int answer = 0;
        // 1. 큰 수가 우선순위를 갖는 우선순위 큐
        /*
        PriorityQueue : 우선순위 큐
        일반적인 큐의 구조 FIFO를 가지면서, 데이터가 들어온 순서대로 데이터가 나가는 것이 아닌
        우선순위를 먼저 결정하고 그 우선순위가 높은 데이터가 먼저 나가는 자료구조
        */
        // int형 priorityQueue 선언 Collections.reverseOrder (우선순위가 높은 숫자 순 = 높은 숫자 순으로 우선순위 결정)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 2. priorities값을 우선순위 큐에 담는다
        for(int n : priorities){
            // add(value), offer(value) 메소드를 이용해서 큐에 값을 넣을 수 있음
            // priorities 배열 : [1, 1, 9, 1, 1, 1]
            // ex. 9 1 1 1 1 1
            pq.offer(n);
        }

        // 3. 큐가 빌 때 까지 반복 == 모든 대기목록이 비워질 때 까지
        while(!pq.isEmpty()){
            // 4. 큐에서 나오는 값과 매칭되는 경우를 탐색
            for(int i = 0; i < priorities.length; i++){
                // 5. 값만 일치하는 경우 해당 문서 출력
                // 큐에 있는 첫 번째 데이터를 참조만하고 지우고 싶지 않은 경우
                // peek() 메소드나 element() 메소드를 이용
                if(pq.peek() == priorities[i] ){
                    // poll() 혹은 remove() 메소드를 이용해서 큐의 값을 제거할 수 있음
                    pq.poll();
                    answer++;
                    // 6. 값과 위치가 모두 일치하면 answer을 반환
                    if(location == i) return answer;
                }
            }

        }
        // 문서가 몇 번째로 인쇄되는지 return
        return answer;
    }
}
