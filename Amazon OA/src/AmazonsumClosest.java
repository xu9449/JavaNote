import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// time: O(nlogn)
//space: O(1)

public class AmazonsumClosest {

    public static void main(String[] args)
    {
        AmazonsumClosest x = new AmazonsumClosest();
        // TODO Auto-generated method stub
        int d = 120;
        int [] nums =  new int [] {10, 50, 60};
        System.out.println(Arrays.toString(x.test(nums, d)));

    }

    int[] test(int[] nums, int d) {
        int[] result = new int[2];

        int target = d - 30;
        if (target <= 0) return result;

        // Use a dynamic array List
        List<Pair> sorted = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sorted.add(new Pair(i, nums[i]));
        }
        Collections.sort(sorted, (i, j) -> (i.val - j.val));

        int closestSum = 0;

        // two pointers
        int left = 0, right = nums.length - 1;
        while (left < right) {
            Pair leftPair = sorted.get(left);
            Pair rightPair = sorted.get(right);
            int sum = leftPair.val + rightPair.val;
            if (sum > target) {
                right--;
            } else {

                //found duplicates
                if (sum == closestSum) {
                    int currentLongestMovie = nums[result[1]];
                    if (rightPair.val > currentLongestMovie) {
                        // found longer movie
                        result[0] = leftPair.index;
                        result[1] = rightPair.index;
                    }
                } else if (sum > closestSum) {
                    closestSum = sum;
                    result[0] = leftPair.index;
                    result[1] = rightPair.index;
                }
                left++;
            }

        }
        return result;
    }

    class Pair {
        int index;
        int val;
        Pair(int index ,int val) {
            this.index = index;
            this.val = val;
        }
    }


    //arrays.sort 复杂度 平均O(nlogn)
    //space O(1)
}
