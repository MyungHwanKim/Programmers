package heap.더맵게;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // given
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        // when
        int result = new Solution().solution(scoville, K);

        // then
        assertEquals(2, result);
    }
}