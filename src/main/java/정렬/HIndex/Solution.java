package 정렬.HIndex;

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int result = citations.length;
        Arrays.sort(citations);  // 인용 횟수별로 정렬
        for (int i = citations.length - 1; i >= 0; i--) {
            // 논문의 개수가 인용 횟수보다 클 경우
            // 눈문의 개수 - 1 한 후 break
            if (citations[i] < citations.length - i) {
                result = citations.length - i - 1;
                break;
            }
        }
        // 결과
        return result;
    }
}