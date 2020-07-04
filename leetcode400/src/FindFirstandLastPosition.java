import java.util.Arrays;

public class FindFirstandLastPosition {

        public static void main(String[] args) {
            int[] num = {1, 2, 3};
            int[] res = searchRange(num, 1);
            System.out.println(Arrays.toString(res));

        }
        public static int[] searchRange(int[] nums, int target) {
/*
            int[] res = new int[2];
            res[0] = -1;
            res[1] = -1;
            if(nums == null || nums.length == 0) return res;

            int left = 0;
            int right = nums.length - 1;
            while(left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    if(mid == 0){
                        res[0] = mid;
                        if(right != 0 && nums[right] == nums[mid]){
                            res[1] = right;
                            return res;
                        } else if (nums[right] != nums[mid]){
                            res[1] = left;
                            return res;
                        } else {
                            res[1] = 0;
                            return res;
                        }
                    } else if(mid == right) {
                        res[0] = res[1] = right;
                        return res;
                    } else {
                        int h1 = mid;
                        int h2 = mid;
                        while(nums[h1 - 1] == nums[h1]) {
                            h1 = h1 - 1;
                            if (h1 == 0) break;
                        }
                        while(nums[h2 + 1] == nums[h2]) {
                            h2 = h2 + 1;
                            if (h2 == nums.length - 1) break;
                        }
                        res[0] = h1;
                        res[1] = h2;
                        return res;
                    }
                } else if (nums[mid] < target && mid != 0) {
                    left = mid;
                } else if (mid == 0 && nums[right] == target){
                    res[1] = res[0] = right;
                    return res;
                }else if (mid == 0 && nums[right] != target){
                    break;
                }
                    else {
                        right = mid;
                    }
                }

            return res;
        }
        */

            if (nums == null || nums.length == 0)     return new int[]{-1, -1};
            int start = firstGreaterOrEqual(nums, target);
            if (start == nums.length || nums[start] != target) {
                return new int[]{-1, -1};
            }
            int end = firstGreaterOrEqual(nums, target + 1);
            return new int[]{start, nums[end] == target? end: end-1};
        }

    public static int firstGreaterOrEqual(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low + 1 < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid;
            } else {
                high = mid;
            }
        }
        if (nums[low] == target)   return low;
        return high;
    }


    }

