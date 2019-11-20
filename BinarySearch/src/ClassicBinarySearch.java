public class ClassicBinarySearch {
    //时间复杂度：最优O（1）最差 O（log（n））
    public int binarySearch (int[] array, int target) {
        if (array.length == 0 || array == null) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        // 最好的是用假如只有一个元素，来验证

        while (left <= right ) {
            mid = left + (right - left) / 2; // 注意防止溢出
            if (array[mid] == target) {
                return mid;
            }
            else if (array[mid] > target) {
                //right = mid;
                right = mid - 1;

            }else
                left = mid + 1;
        }

        return -1;
    }
}
