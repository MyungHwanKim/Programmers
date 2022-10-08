package queue.같은숫자는싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();  // 남은 수 담을 queue
        // 이전 숫자
        int num = -1;
        for (int item : arr) {
            // 이전 숫자와 현재 값이 같다면 연속적이므로 continue
            if (num == item) {
                continue;
            }
            queue.offer(item);
            num = item;
        }

        int[] result = new int[queue.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = queue.poll();
        }
        return result;
    }
}
