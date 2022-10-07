package heap.더맵게;

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        // 낮은 스코빌 지수 순으로 넣은 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> x - y);
        for (int item: scoville) {
            pq.offer(item);
        }
        int cnt = 0; // 횟수를 담을 변수
        while (pq.peek() < K) {
            // 우선순위 큐에서 꺼낼 값이 K보다 같거나 크면 종료
            int cur1 = pq.poll();
            int cur2 = pq.poll();

            // cur2가 이미 K 이상일 경우
            if (cur2 >= K) {
                cnt++;
                break;
            }

            // 섞은 스코빌 지수
            pq.offer(cur1 + (cur2 * 2));
            cnt++;

            // 모든 음식의 스코빌 지수가 K이상으로 만들 수 없을 경우
            if (pq.size() == 1 && pq.peek() < K) {
                return -1;
            }
        }
        return cnt;
    }
}
