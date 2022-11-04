package stack_queue.주식가격;

import java.util.*;

// for 문 풀이
class Solution1 {
    public int[] solution(int[] prices) {
        // 가격이 떨어지지 않은 기간을 담을 배열
        int[] times = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                times[i]++;
                // 다음 가격이 현재 가격보다 작을 경우 break
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }
        // 결과
        return times;
    }
}

// stack 풀이
class Solution2 {
    public int[] solution(int[] prices) {
        // 가격이 떨어지지 않은 기간을 담을 배열
        int[] times = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        // 시작 인덱스 추가(0번째)
        stack.push(0);

        for (int i = 1; i < prices.length; i++) {
            // stack 이 비어 있지 않고
            // stack 에 있는 인덱스의 price 값이 현재 price 값보다 클 경우
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int curIdx = stack.pop();
                // 현재 위치 인덱스 값에서
                // stack 에서 꺼낸 인덱스 값을 뺀 값
                times[curIdx] = i - curIdx;
            }
            // 다음 인덱스 추가
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int curIdx = stack.pop();
            // price 전체 길이에서 stack 에 있는 인덱스 값 - 1
            times[curIdx] = prices.length - curIdx - 1;
        }
        // 결과
        return times;
    }
}