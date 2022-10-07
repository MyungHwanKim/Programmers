package 정렬.k번째수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionTest() {
        // given
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        // when
        int[] result1 = new Solution().solution1(array, commands);
        int[] result2 = new Solution().solution2(array, commands);

        // then
        assertEquals(5, result1[0]);
        assertEquals(5, result2[0]);
        assertEquals(6, result1[1]);
        assertEquals(6, result2[1]);
        assertEquals(3, result1[2]);
        assertEquals(3, result2[2]);
    }
}