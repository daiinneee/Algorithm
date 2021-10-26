package Programmers;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Prac_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 1, 15, 8, 21, 25, 18, 10 값 추가
        pq.add(1);
        pq.add(15);
        pq.offer(10);
        pq.add(21);
        pq.add(25);
        pq.offer(18);
        pq.add(8);

        // 출력 : 1
        System.out.println(pq.peek());

        // 출력 : 7
        System.out.println(pq.size());

        // Priority Queue에서 peek() 메소드를 사용하면 우선순위가 가장 높은 값을 출력
        // 출력 : 1
        System.out.println(pq.peek());

        // 전체 Queue의 값을 가져오려면 Iterator 메소드를 사용하여 가져오면 됨
        // 출력 : 1 15 8 21 25 18 10
        Iterator iterator = pq.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();

        // 출력 : [1, 15, 8, 21, 25, 18, 10]
        System.out.println(pq);

        pq.poll();
        // 출력 : [8, 15, 10, 21, 25, 18]
        System.out.println(pq);

        pq.remove();
        pq.remove(1);
        // 출력 : [10, 15, 18, 21, 25]
        System.out.println(pq);

        pq.clear();
        // 출력 : []
        System.out.println(pq);
    }
}

