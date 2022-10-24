package stack_queue.같은숫자는싫어;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // given
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        // when
        int[] result = new Solution().solution(arr);

        // then
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(0, result[2]);
        assertEquals(1, result[3]);
    }
}