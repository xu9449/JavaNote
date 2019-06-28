/*import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TwoStackQueue {
    static class Stack{

        // Two inbuilt quiues
        static Stack<Integer> q1 = new Stack<Integer>();
        static Stack<Integer> q2 = new Stack<Integer>();

        static void enQueue(int x) {

        }
        // To maintain current number of elements
        static int curr_size;

        Stack() {
            curr_size = 0;
        }

        static void push(int x) {

        curr_size++;

        //push x first in empty q2
            q2.add(x);

            while (!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }

            //swap the names of two queues
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }
          //为何要换名字

        static void pop() {
            if (q1.isEmpty())
                return;
            q1.remove();
            curr_size--;
        }

        static int top() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }

        static int size() {
            return curr_size;
        }
    }
    }*/


