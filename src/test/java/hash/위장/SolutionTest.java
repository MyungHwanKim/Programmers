package hash.위장;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // given
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        // when
        int result1 = new Solution().solution(clothes1);
        int result2 = new Solution().solution(clothes2);

        // then
        assertEquals(5, result1);
        assertEquals(3, result2);
    }
}