package bruteForce.최소직사각형;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // given
        int[][] sizes1 = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3 = new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        // when
        int result1 = new Solution().solution(sizes1);
        int result2 = new Solution().solution(sizes2);
        int result3 = new Solution().solution(sizes3);

        // then
        assertEquals(4000, result1);
        assertEquals(120, result2);
        assertEquals(133, result3);
    }
}