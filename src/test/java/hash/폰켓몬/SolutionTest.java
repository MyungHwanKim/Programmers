package hash.폰켓몬;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void test() {
        // given
        int[] nums = {3,3,3,2,2,2};

        // when
        int result = new Solution().solution(nums);

        // then
        assertEquals(2, result);
    }
}