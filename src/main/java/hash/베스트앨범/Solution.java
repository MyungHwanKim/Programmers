package hash.베스트앨범;

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 재생 횟수의 합의 담을 Map
        // key : genres , value : plays 의 합
        Map<String, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            // sumMap 에 genre[i] 가 존재한다면 기존 value 값에 plays[i]를 더한다.
            // 처음 map 에 추가되는 genre[i]라면 default 값으로 0 에다가 plays[i]를 더한다.
            sumMap.put(genres[i], sumMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        // sumMap 예 있는 key 를 담을 List
        List<String> keySetList = new ArrayList<>(sumMap.keySet());
        // sumMap 의 value 값으로 내림차순한 key 값으로 keySetList 정렬
        keySetList.sort((o1, o2) -> sumMap.get(o2).compareTo(sumMap.get(o1)));

        // 장르별 plays 와 index 값을 담을 Map (genre : {plays, index})
        Map<String, ArrayList<int[]>> map = new HashMap<>();
        for (String genre : genres) {
            map.put(genre, new ArrayList<>());
        }

        // 예시
        // "classic" : {{500, 0}, {150, 2}, {800, 3}}
        //   "pop    : {{600, 1}, {2500, 4}}
        for (int i = 0; i < plays.length; i++) {
            map.get(genres[i]).add(new int[]{plays[i], i});
        }

        // key 값별로 value 를 plays 값의 내림차순으로 정렬
        // 만약 plays 값이 같다면 index 값이 더 작은 순으로 정렬
        for (Map.Entry<String, ArrayList<int[]>> kv : map.entrySet()) {
            kv.getValue().sort(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] == o2[0]) {
                        return o1[1] - o2[1];
                    }
                    return o2[0] - o1[0];
                }
            });
        }

        // 노래의 고유 번호를 담을 List
        List<Integer> result = new ArrayList<>();
        for (String key : keySetList) {
            for (Map.Entry<String, ArrayList<int[]>> kv : map.entrySet()) {
                // keySet 의 key 값과 map 의 key 과 일치할 경우
                if (key.equals(kv.getKey())) {
                    // plays 수가 많은 2개의 인덱스를 담지만
                    // kv.getValue() 길이가 2 미만 일수도 있으므로
                    // if 문으로 2 미만일 때와 2 이상일 때 구분
                    if (kv.getValue().size() == 1) {
                        result.add(kv.getValue().get(0)[1]);
                    } else {
                        for (int i = 0; i < 2; i++) {
                            result.add(kv.getValue().get(i)[1]);
                        }
                    }
                }
            }
        }
        // 결과 List -> int[] 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}