package stack_queue.주식가격;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // given
        int[] prices = new int[]{1, 2, 3, 2, 3};

        // when
        int[] times1 = new Solution1().solution(prices);
        int[] times2 = new Solution2().solution(prices);

        // then
        assertEquals("[4, 3, 1, 1, 0]", Arrays.toString(times1));
        assertEquals("[4, 3, 1, 1, 0]", Arrays.toString(times2));
    }
}