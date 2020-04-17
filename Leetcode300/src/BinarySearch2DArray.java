public class BinarySearch2DArray {
    public boolean searchMatrix(int[][] matrix, int target){
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            int row = mid/matrix[0].length;
            int col = mid%matrix[0].length;
            int tmp = matrix[row][col];
            if (tmp < target) {
                left = mid + 1;
            } else if (tmp == target) {
                return true;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearch2DArray b = new BinarySearch2DArray();
        int[][] a = {{1,3,6,7},{10, 11, 16, 20},{23,30,34,50}};
        System.out.println(b.searchMatrix(a, 50));
    }
}
