package 정렬.HIndex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // given
        int[] citations = {3, 0, 6, 1, 5};
        int[] citations1 = {10000, 0, 5000, 200, 5, 100, 300, 250, 1, 2000, 99, 8, 77, 666, 55, 444, 123, 456};

        // when
        int result = new Solution().solution(citations);
        int result1 = new Solution().solution(citations1);

        // then
        assertEquals(3, result);
        assertEquals(14, result1);
    }
}