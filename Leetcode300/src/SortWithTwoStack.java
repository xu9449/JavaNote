import java.util.LinkedList;

public class SortWithTwoStack {
    public class Solution {
        public void sort(LinkedList<Integer> s1) {
            LinkedList<Integer> s2 = new LinkedList<Integer>();
            // Write your solution here.
            while(!s1.isEmpty()) {
                int helper = s1.pop();
                while(!s2.isEmpty() && s2.peek()>helper){
                    s1.push(s2.pop());
                }
                s2.push(helper);
            }
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

    }
}
