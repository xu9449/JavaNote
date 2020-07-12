import java.util.Stack;

public class DailyTemperature {
    class Solution {
        public int[] dailyTemperatures(int[] T) {
            if (T == null || T.length == 0) {
                return T;
            }
            Stack<Integer> stack = new Stack<>();
            int[] ret = new int[T.length];
            for(int i = 0; i < T.length; i++) {
                while(!stack.isEmpty() && T[i] > T[stack.peek()]) {
                    int idx = stack.pop();
                    ret[idx] = i - idx;
                }
                stack.push(i);
            }
            return ret;
        }
    }
}
