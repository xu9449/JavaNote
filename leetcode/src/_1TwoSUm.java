public class _1TwoSUm {
    public static void main(String[] args) {
        _1TwoSUm s = new _1TwoSUm();
        int[] arr = {3, 2, 3};
        int[] res = s.twoSum(arr, 6);
        for (int i: res){
            System.out.println(i);
        }
    }

        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            if(nums == null || nums.length == 0) return res;
            // how about use it twice
            // sort the array
            int dif = Integer.MAX_VALUE;
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] >= target) {
                    break;
                }
                int leftNum = target - nums[i];
                int closestNum = binarySearch(nums, i+1, nums.length - 1, leftNum);
                int temdif = Math.abs(nums[i] + nums[closestNum] - target);
                if(temdif< dif){
                    res[0] = i;
                    res[1] = closestNum;
                    dif = temdif;
                }

            }
            return res;
        }

        public int binarySearch(int[] arr, int l, int r, int tar){
            while(l < r - 1){
                int mid = l + (r - l)/2;
                if(arr[mid] == tar){
                    return mid;
                } else if(arr[mid] < tar){
                    l = mid;
                } else {
                    r = mid;
                }
            }
            if(Math.abs(arr[l] - tar) <= Math.abs(arr[r] - tar)){
                return l;
            } else {
                return r;
            }
        }
    }

