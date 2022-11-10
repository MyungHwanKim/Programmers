package 정렬.가장큰수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // given
        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};
        int[] numbers3 = {0, 0, 0, 0, 0};
        int[] numbers4 = {1000, 0, 234, 2, 1, 325, 32, 33, 23, 13, 131, 14, 143};

        // when
        String result1 = new Solution().solution(numbers1);
        String result2 = new Solution().solution(numbers2);
        String result3 = new Solution().solution(numbers3);
        String result4 = new Solution().solution(numbers4);

        // then
        assertEquals("6210", result1);
        assertEquals("9534330", result2);
        assertEquals("0", result3);
        assertEquals("33325322342321431413131110000", result4);
    }
}