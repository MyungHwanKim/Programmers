package hash.완주하지못한선수;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("동명이인이 없을 경우")
    void notSameNameTest() {
        // given
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        // when
        String result = new Solution().solution(participant, completion);

        // then
        assertEquals("leo", result);
    }

    @Test
    @DisplayName("동명이인이 있을 경우")
    void sameNameTest() {
        // given
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        // when
        String result = new Solution().solution(participant, completion);

        // then
        assertEquals("mislav", result);
    }
}