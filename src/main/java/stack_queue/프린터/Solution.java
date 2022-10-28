package stack_queue.프린터;

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();  // 인쇄 대기목록을 나타낼 queue

        for (int i = 0; i < priorities.length; i++) {
            // [대기번호, 중요도]로 담는다.
            queue.offer(new int[]{i, priorities[i]});
        }
        Arrays.sort(priorities);  // 우선순위가 큰 순서대로 처리하기 위한 정렬

        int idx = priorities.length - 1;  // 정렬 후 우선순위가 가장 큰 인덱스
        int num = 0;  // 인쇄 처리 개수
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            // 인쇄 대기목록에서 꺼낸 우선순위가 처리해야할 우선순위 값보다 작을 경우
            // 다시 인쇄 대기목록(queue)에 넣어준다.
            if (cur[1] < priorities[idx]) {
                queue.offer(cur);
            // 현재 꺼낸 우선순위 값이 처리해야할 우선순위가 같을 경우
            } else if (cur[1] == priorities[idx]) {
                num++;
                idx--;
                // 꺼낸 우선순위와 처리해야할 우선순위가 같고
                // 요청한 문서가 나의 문서일 경우 종료
                if (cur[0] == location) {
                    break;
                }
            }
        }
        // 처리된 순서 결과
        return num;
    }
}
