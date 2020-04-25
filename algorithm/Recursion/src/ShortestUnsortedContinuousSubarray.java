public class ShortestUnsortedContinuousSubarray {
    public static void main(String args[]) {
        ShortestUnsortedContinuousSubarray solution = new ShortestUnsortedContinuousSubarray();
        int[] input = {2, 1, 5, 6, 7};
        int result = solution.findUnsortedSubarray(input);
        System.out.println(result);

    }

    public int findUnsortedSubarray(int[] nums) {
        if(nums == null) return 0;
        if(nums.length == 0 || nums.length == 1) return 0;

        int max = 0;
        int end = -2;
        //iterate from beginning of array
        //find the last element which is smaller than the last seen max from
        //its left side and mark it as end
        for(int i = 0; i < nums.length; i ++){
            max = Math.max(max, nums[i]);
            if(nums[i] < max)
                end = i;
        }

        int min = 0;
        int begin = -1;
        //iterate from end of array
        //find the last element which is bigger than the last seen min from
        //its right side and mark it as begin
        for(int i = nums.length - 1; i >= 0; i --){
            min = Math.min(min, nums[i]);
            if(nums[i] > min)
                begin = i;
        }

        return end - begin + 1;
//        if ( nums.length <= 1 || nums == null) {
//            return 0;
//        }
//
//        int L = 0;
//        int R = nums.length - 1;
//        boolean a = false;
//        boolean b = false;
//
//        while(L <= R) {
//            for(int i = 1; i <= R; i++ ) {
//                if (nums[L] > nums[i]) {
//                    a = true;
//                    break;
//
//                } else {
//                    L++;
//                }
//            }
//                    for (int j = nums.length - 2; j >= 0; j--) {
//                        if(nums[R] < nums[j]) {
//                            b = true;
//                            break;
//
//                        } else {
//                            R--;
//                        }
//                    }
//
//            }
//            if ( a == true && b == true) {
//                return R - L + 1;
//            } else if (a == true){
//                return (nums.length - 1 - L);
//            } else if (b == true) {
//                return R + 1;
//            }
//        }
//        return R - L + 1;
    }
}
