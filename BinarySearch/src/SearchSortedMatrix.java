/*
思路1： 两次Binary Search
Time： O(log m + log n)
：： 更麻烦一些，需要找到在在两行之间
空间：O(1)
思路2： 拉成一维的方式，做binary Search
O(log m * n)
空间：O(1)
 */



public class SearchSortedMatrix {
    public boolean ifFind(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = row * col - 1;
        while ( i <= j) {
            int mid = i + (j - i )/2;
            int r = mid / col;
            int c = mid % col;
            if ( matrix[r][c] == target) {
                return true;
            }
            else if (matrix[r][c] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return false;
    }
}
