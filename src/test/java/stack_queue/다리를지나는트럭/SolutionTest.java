package stack_queue.다리를지나는트럭;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // given
        int bridge_length1 = 2;
        int weight1 = 10;
        int[] truck_weights1 = new int[]{7, 4, 5, 6};
        int bridge_length2 = 100;
        int weight2 = 100;
        int[] truck_weights2 = new int[]{10};
        int bridge_length3 = 100;
        int weight3 = 100;
        int[] truck_weights3 = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        // when
        int result1 = new Solution().solution(bridge_length1, weight1, truck_weights1);
        int result2 = new Solution().solution(bridge_length2, weight2, truck_weights2);
        int result3 = new Solution().solution(bridge_length3, weight3, truck_weights3);

        // then
        assertEquals(8, result1);
        assertEquals(101, result2);
        assertEquals(110, result3);
    }
}