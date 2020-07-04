import java.util.HashSet;

public class Test {
    public int missing(int[] array) {
        int n = array.length + 1;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int number: array) {
            set.add(number);
        }
        for (int i = 1; i < n; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return n;
    }

}
