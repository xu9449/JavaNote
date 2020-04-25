package Support;

public class factory {
    public int recursive(int x) {
        if (x == 0) return 1;
        return x * recursive(x - 1);
    }
}
