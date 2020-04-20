public class SearchInRoatatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,3,5};
        SearchInRoatatedSortedArray solution = new SearchInRoatatedSortedArray();
        int result = solution.search(nums, 1);
        System.out.println(result);
    }
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        int reverse = 0;
        int index;
        // find the reverse index
        while(left<= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] >nums[mid+1]) {
                reverse = mid;
                break;
            }
            if(nums[mid] > nums[left]){
                //left = mid;
                left = mid + 1;
            } else {
                //right = mid;
                right = mid - 1;
            }
        }
        if(nums[reverse] == target) {
            return reverse;
        }
        if(nums[reverse] > target && nums[reverse]<nums[0]) {
            index = binarySearch(nums, 0, reverse - 1, target);
        } else {
            index = binarySearch(nums, reverse + 1, nums.length - 1, target);
        }

        return index;
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        while(left<=right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target) {
                // right = mid;
                right = mid - 1;
            } else {
                // left = mid;
                left = mid + 1;
            }
        }
        return -1;
    }
}
