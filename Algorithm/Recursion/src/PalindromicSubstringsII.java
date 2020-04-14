import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstringsII {
    public static void main(String[] args) {
        PalindromicSubstringsII solution = new PalindromicSubstringsII();
        int[] nums = {11, 22, 33};
        List<List<Integer>> result = solution.subsets(nums);
        System.out.println(result);
    }

    public List<List<Integer>> subsets(int[] nums)  {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }
        List<Integer> prefix = new ArrayList<>();
        findSubset(nums, 0, prefix, result);
        return result;
    }

    public void findSubset(int[] input, int index, List<Integer> prefix, List<List<Integer>> result) {
        if (index == input.length) {
            result.add(new ArrayList<>(prefix));
            return;
        }

        // case 1: add input[index] to the solution prefix
        prefix.add(input[index]);
        findSubset(input, index + 1, prefix, result);
        prefix.remove(prefix.size() - 1);

        //case 2: do not addd input[index] to the solution prefix
        findSubset(input, index + 1, prefix, result);

    }
}
