package 정렬.k번째수;

import java.util.*;

class Solution {
    public int[] solution1(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 정답을 넣은 배열
        int cnt = 0; // 배열에 들어갈 인덱스 번호
        for(int[] command: commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            // i ~ j번째 값을 넣은 리스트
            List<Integer> list = new ArrayList<>();
            for (int l = i - 1; l < j; l++) {
                list.add(array[l]);
            }
            Collections.sort(list); // 정렬
            // 원하는 k번째 값을 결과 배열에에 넣어줌
            answer[cnt++] = list.get(k - 1);
        }
        return answer;
    }

    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 정답을 넣은 배열
        int cnt = 0; // 배열에 들어갈 인덱스 번호
        for(int[] command: commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            // i ~ j번째 값을 넣은 배열
            int[] arr = new int[j - i + 1];
            int tmp = 0;
            for (int l = i - 1; l < j; l++) {
                arr[tmp++] = array[l];
            }
            sort(arr); // 정렬
            // 원하는 k번째 값을 결과 배열에 넣어줌
            answer[cnt++] = arr[k - 1];
        }
        return answer;
    }

    // 정렬 메소드
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
    }
}