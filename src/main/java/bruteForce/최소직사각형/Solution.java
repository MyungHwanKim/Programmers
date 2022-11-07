package bruteForce.최소직사각형;

import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int x = 0;  // 제일 긴 길이
        int y = 0;  // 가로, 세로 중 짧은 길이들 중 가장 긴 길이
        for (int[] size : sizes) {
            // 모든 명함을 담기 위해 명함마다 크기 정렬
            Arrays.sort(size);
            // 정렬된 가로, 세로 중 긴 길이와 현재 x와 비교
            x = Math.max(x, size[1]);
            // 정렬된 가로, 세로 중 짧은 길이와 현재 y와 비교
            y = Math.max(y, size[0]);
        }

        // 지갑의 크기
        return x * y;
    }
}
