package stack_queue.기능개발;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void functionDevTest() {
        // given
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        // when
        int[] result = new Solution().solution(progresses, speeds);

        // then
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
    }
}