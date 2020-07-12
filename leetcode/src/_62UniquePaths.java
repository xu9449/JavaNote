public class _62UniquePaths {
    public static void main(String[] args) {
        _62UniquePaths s = new _62UniquePaths();
        int res = s.uniquePaths(3, 2);
        System.out.println(res);
    }
    public int uniquePaths(int m, int n) {
        int result = 0;
        heler(result, m, n, m-1, n-1, 0);
        return result;
    }
    private void heler(int res, int m, int n, int rowLeft, int colLeft, int index) {
        if(rowLeft < 0 || colLeft < 0){
            return;
        }
        if (rowLeft == 0 && colLeft == 0) {
            res++;
            return;
        }
        if (rowLeft == 0) {
            heler(res, m, n, rowLeft, --colLeft, index + 1);
        } else if (colLeft == 0) {
            heler(res, m, n, --rowLeft, colLeft, index + 1);
        }
        heler(res, m, n, rowLeft - 1, colLeft, index + 1);
        heler(res, m, n, rowLeft, colLeft - 1, index + 1);

    }
}
