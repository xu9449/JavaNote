import java.util.*;

public class Finback670 {
    public static void main(String[] args) {
        List<List<Integer>> c = new ArrayList<>();
        List<List<Integer>> d = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        d.add(a);
        d.add(b);
        c.addAll(d);
        c.add(b);
        System.out.println(c);
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(1);


        short s1 = 1;
        s1 +=1;

        System.out.println((s1));


    }

}
