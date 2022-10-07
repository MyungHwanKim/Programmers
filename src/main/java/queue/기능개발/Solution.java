package queue.기능개발;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>(); // 남은 작업 일수 담을 queue
        List<Integer> list = new ArrayList<>(); // 배포될 갯수 리스트

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                // 100%가 딱 맞아 떨어질 경우
                queue.offer((100 - progresses[i]) / speeds[i]);
            } else { // 그 외
                queue.offer((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        int cnt = 0; // 개수를 셀 변수
        int tmp = queue.peek(); // 임시 값
        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (tmp < cur) { // 임시 값보다 방금 꺼낸 queue값이 더 클 경우
                list.add(cnt);
                tmp = cur;
                cnt = 1;
            } else {
                cnt++;
            }

            if (queue.isEmpty()) { // queue가 비었을 경우
                list.add(cnt);
                break;
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
