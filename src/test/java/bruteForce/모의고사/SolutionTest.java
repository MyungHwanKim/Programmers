package bruteForce.모의고사;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // given
        int[] answers = {1,3,2,4,2};

        // when
        int[] result = new Solution().solution(answers);

        // then
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
    }
}