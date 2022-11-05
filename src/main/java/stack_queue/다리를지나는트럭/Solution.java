package stack_queue.다리를지나는트럭;

import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;  // 다리를 건너는 시간
        int sum = 0;  // 다리 위에 있는 무게
        Queue<Integer> queue = new LinkedList<>();
        for (int truck_weight : truck_weights) {
            while (true) {
                // 다리 위가 비어 있을 경우
                if (queue.isEmpty()) {
                    queue.offer(truck_weight);
                    sum += truck_weight;
                    time++;
                    break;
                // 다리 위에 있는 트럭 수와 다리 길이가 일치할 경우
                } else if (queue.size() == bridge_length) {
                    sum -= queue.poll();
                } else {
                    // 현재 다리 위에 있는 트럭 무게에서 현재 트럭 무게의 합이
                    // 다리가 견딜 수 있는 최대 무게보다 같거나 작을 경우
                    if (sum + truck_weight <= weight) {
                        queue.offer(truck_weight);
                        sum += truck_weight;
                        time++;
                        break;
                    } else {
                        queue.offer(0);
                        time++;
                    }
                }
            }
        }
        // 마지막 트럭이 다리 위에 올라간 시간 + 다리 길이
        // 마지막 트럭이 올라간 후 다리 길이만큼이 모든 트럭이 건널 수 있는 시간
        return time + bridge_length;
    }
}
