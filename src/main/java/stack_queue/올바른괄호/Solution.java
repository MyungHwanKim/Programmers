package stack_queue.올바른괄호;

import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean isFlag = true; // 올바른 괄호인지 파악
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // '(' 믄지일 경우만 stack 에 push
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                // stack 이 비어있는데
                // ')' 문자가 들어오는 경우
                if (stack.isEmpty()) {
                    isFlag = false;
                    break;
                // 올바른 괄호일 경우
                } else {
                    stack.pop();
                }
            }
        }
        // stack 이 비어있지 않도록 진행된 경우면서
        // 실제 모든 괄호를 파악했을 때 stack 이 비어있을 경우
        return isFlag && stack.isEmpty();
    }
}
