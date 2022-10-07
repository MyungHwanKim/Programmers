package hash.완주하지못한선수;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String result = ""; // 정답 담을 변수
        HashMap<String, Integer> map = new HashMap<>();
        // participant를 map에 담아줌
        for (String item: participant) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        // map에서 completion 확인하며 감소
        for(String item: completion) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) - 1);
            }
        }
        // completion 후 남은 participant 확인
        for (String item: participant) {
            if (map.get(item) != 0) {
                result = item;
            }
        }
        return result;
    }
}