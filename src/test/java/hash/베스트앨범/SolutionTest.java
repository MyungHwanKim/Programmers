package hash.베스트앨범;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // given
        String[] genres1 = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays1 = {500, 600, 150, 800, 2500};
        String[] genres2 = {"classic", "classic", "classic", "classic", "pop"};
        int[] plays2 = {1500, 500, 150, 800, 2500};

        // when
        int[] result1 = new Solution().solution(genres1, plays1);
        int[] result2 = new Solution().solution(genres2, plays2);

        // then
        assertEquals("[4, 1, 3, 0]", Arrays.toString(result1));
        assertEquals("[0, 3, 4]", Arrays.toString(result2));
    }
}