package stack_queue.올바른괄호;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {


    @Test
    void test() {
        // given
        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

        // when
        boolean result1 = new Solution().solution(s1);
        boolean result2 = new Solution().solution(s2);
        boolean result3 = new Solution().solution(s3);
        boolean result4 = new Solution().solution(s4);

        // then
        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
        assertFalse(result4);
    }
}