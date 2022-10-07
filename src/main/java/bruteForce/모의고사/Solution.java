package bruteForce.모의고사;

import java.util.*;

class Solution {
    // 1번 수포자 찍는 방식
    static final int[] guess1 = {1, 2, 3, 4, 5};
    // 2번 수포자 찍는 방식
    static final int[] guess2 = {2, 1, 2, 3, 2, 4, 2, 5};
    // 3번 수포자 찍는 방식
    static final int[] guess3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    public int[] solution(int[] answers) {
        int[] answer = new int[3]; // 수포자 삼인방이기에 3으로 크기 지정
        for (int i = 0; i < answers.length; i++) {
            // 1번 수포자가 찍어서 맞추는 경우
            if (answers[i] == guess1[i % guess1.length]) {
                answer[0] += 1;
            }
            // 2번 수포자가 찍어서 맞추는 경우
            if (answers[i] == guess2[i % guess2.length]) {
                answer[1] += 1;
            }
            // 3번 수포자가 찍어서 맞추는 경우
            if (answers[i] == guess3[i % guess3.length]) {
                answer[2] += 1;
            }
        }

        // 결과물을 담을 List
        List<Integer> result = new ArrayList<>();
        int k = answers.length; // 문제 수(=정답 수)
        while (k > 0) {
            for (int i = 0; i < answer.length; i++) {
                // 다 맞았을 경우부터 줄여나가면서 맞춘 갯수가 있는 경우 result에 추가
                if (answer[i] == k) {
                    result.add(i + 1);
                }
            }
            // 가장 많은 문제를 맞춘 사람을 구하기에 result가 비어있지 않다면 바로 탈출
            if (!result.isEmpty()) {
                break;
            }
            k--;
        }
        // List를 int 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
