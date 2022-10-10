package hash.전화번호목록;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void test() {
        // given
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123","456","789"};
        String[] phone_book3 = {"12","123","1235","567","88"};

        // when
        boolean sl1 = new Solution1().solution(phone_book1);
        boolean sl2 = new Solution1().solution(phone_book2);
        boolean sl3 = new Solution1().solution(phone_book3);
        boolean hash1 = new Solution2().solution(phone_book1);
        boolean hash2 = new Solution2().solution(phone_book2);
        boolean hash3 = new Solution2().solution(phone_book3);

        // then
        assertFalse(sl1);
        assertTrue(sl2);
        assertFalse(sl3);
        assertFalse(hash1);
        assertTrue(hash2);
        assertFalse(hash3);
    }

}