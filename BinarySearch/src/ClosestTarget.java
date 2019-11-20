public class ClosestTarget {
    public int closest(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;

        while (left < right - 1) {
            //这样写一般是只剩下一个或者两个元素的时候停下来
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;

            } else if (array[mid] < target) {
                left = mid; //此处不可以写 left = mid + 1
            } else {
                right = mid; // 此处不可以写 right = mid - 1 如果跳过，容易错过，因为此处不一定有target在数列中，所以不可以+1，-1
            }
        }
        if (Math.abs(array[left] - target) <= Math.abs(array[right] - target))
        { return left;
        }
        else{
            return right;
        }
    }
}
