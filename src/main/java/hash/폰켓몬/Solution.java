package hash.폰켓몬;

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // HashSet 을 통해 중복 제거
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // 최대 nums 의 길이 / 2 마리까지 다양하게 가져가야 하므로,
        // 중복 제거한 set 의 크기와 nums 의 길이 / 2 중 더 작은 값을 선택
        return Math.min(nums.length / 2, set.size());
    }
}
