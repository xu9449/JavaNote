import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        MergeSort solution = new MergeSort();
        int[] array = {2, 4, 1, 5, 3};
        List<Integer> list = new ArrayList<>();
        list = solution.sortArray(array);
        System.out.println((Arrays.toString(list.toArray())));
    }

    public List<Integer> sortArray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums == null) {
            return list;
        }
        // allocate helper array to help merge step,
        // so that we guarantee no more than O(n) space is usedd.
        // The space complexity is O(n) in this case
        int[] helper = new int[nums.length];
        mergeSort(nums, helper, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        return list;
    }

    private void mergeSort(int[] nums, int[] helper, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, helper, left, mid);
        mergeSort(nums, helper, mid + 1, right);
        merge(nums, helper, left, mid, right);
    }

    private void merge(int[] nums, int[] helper, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            helper[i] = nums[i];
        }
        int leftIndex = left;
        int rightIndex = mid + 1;
        while (leftIndex <= mid && rightIndex <= right) {
            if (helper[leftIndex] <= helper[rightIndex]) {
                nums[left++] = helper[leftIndex++];
            } else {
                nums[left++] = helper[rightIndex++];
            }
        }
        // if we still have some elements at left side, we needd to copy thiem
        while (leftIndex <= mid) {
            nums[left++] = helper[leftIndex++];
        }
    }
}
