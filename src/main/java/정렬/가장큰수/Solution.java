package 정렬.가장큰수;

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // int 배열인 numbers String 배열로 변환
        String[] str = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);

        // 두 문자를 더했을 때 더 큰 값이 앞으로 오도록 정렬
        // ex.) o1 = 3, o2 = 30 이라고 가정하면 330 과 303 이 나오므로 3이 30보다 앞에 위치하게 된다.
        // ex.) o1 = 3, o2 = 34 이라고 가정하면 334 과 343 이 나오므로 34이 3보다 앞에 위치하게 된다.
        Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 0이 반복되어 "00000"으로 나올 수도 있으므로 str 배열의 0번째 값이 0이라면 "0"으로 반환한다.
        // 그 외의 값은 join 을 통해 하나의 문자로 합쳐 반환한다.
        return str[0].equals("0") ? "0" : String.join("", str);
    }
}
