package hash.위장;

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            // cloth[1](의상의 종류)를 key 로 가지도록 하여 value 에 의상의 개수 파악
            // ex> key : value
            //      A  : a
            //      B  : b
            //      C  : c 라고 가정
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        // 최종 결과는 abc + ab + bc + ac + abc 이다.
        int count = 1;
        for(Map.Entry<String, Integer> kv : map.entrySet()) {
            // 의상의 개수에 + 1 하여 총 개수의 곱해준다.
            count *= kv.getValue() + 1;
        }
        // count 값은 (a + 1)(b + 1)(c + 1) = abc + ab + bc + ca + 1 이므로
        // 최종 결과를 위해 -1 을 해준다.
        return count - 1;
    }
}
