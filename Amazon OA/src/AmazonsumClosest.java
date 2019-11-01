import java.util.ArrayList;
import java.util.Arrays;

// time: O(nlogn)
//space: O(1)
public class AmazonsumClosest {
    public static int[] test(int[] nums, int d) {
        int[] result = new int[2];
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = nums.length - 1;
        Arrays.sort(nums);
        int j = 0;
        int i = 0;

        while(start <= end)
        {
            if((nums[start] + nums[end])<= d-30)
            {

                if(max < (nums[start] + nums[end]))
                {
                    max = (nums[start] + nums[end]);
                    i = nums[start];
                    j = nums[end];
                }
                start++;

            }
            else if((nums[start] + nums[end]) > d-30)
            {
                end--;
            }
        }
        result[0] = i;
        result[1] = j;
        return result;

    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int d = 220;
        int [] nums =  new int [] {90, 85, 75, 60, 60, 120, 125, 150, 125};
        System.out.println(Arrays.toString(AmazonsumClosest.test(nums, d)));

    }
    //arrays.sort 复杂度 平均O(nlogn)
    //space O(1)
}
