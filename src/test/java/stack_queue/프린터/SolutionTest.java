package stack_queue.프린터;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // given
        int[] priorities1 = new int[]{2, 1, 3, 2};
        int location1 = 2;
        int[] priorities2 = new int[]{1, 1, 9, 1, 1, 1};
        int location2 = 0;

        // when
        int result1 = new Solution().solution(priorities1, location1);
        int result2 = new Solution().solution(priorities2, location2);

        // then
        assertEquals(1, result1);
        assertEquals(5, result2);
    }
}