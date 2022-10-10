package hash.전화번호목록;

import java.util.*;

// Sort/Loop 방식
class Solution1 {
    public boolean solution(String[] phone_book) {
        // 비교를 위한 정렬
        Arrays.sort(phone_book);
        for (int i = 1; i < phone_book.length; i++) {
            // 현재 번호가 이전 번호로 시작하는지 확인
            if (phone_book[i].startsWith(phone_book[i - 1])) {
                return false;
            }
        }
        return true;
    }
}

// HashMap 방식
class Solution2 {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            // 모든 전화번호 map 에 추가
            map.put(phone_book[i], i);
        }

        for (String phone : phone_book) {
            for (int j = 0; j < phone.length(); j++) {
                // 번호에 대해 loop 를 돌면서 모든 substring 이 map 에 존재 여부 파악
                if (map.containsKey(phone.substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
