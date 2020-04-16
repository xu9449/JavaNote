import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {
    public List<Integer> findDuplicates(int[] nums){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if(nums[index] < 0) {
                result.add(nums[index]);
            } else {
                nums[index - 1] = -nums[index -1];
            }
        }
        return result;
    }
}
