import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSorteddArray {

    public static void main(String[] args) {
        MergeSorteddArray solution = new MergeSorteddArray();
        int[] array1 = new int[2];
        array1[0] = 2;
//        array1[1] = 4;
//        array1[2] = 6;
        int[] array2 = {1};
        solution.merge(array1, 1, array2, 1);
        System.out.println((Arrays.toString(array1)));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0 || nums2.length == 0)   {
            return;
        }
        int[] res = new int[nums1.length];
        int upIdx = 0;
        int downIdx = 0;

        for (int index = 0; index < m+n; index++) {
            if (downIdx < n && upIdx < m) {
                if (nums1[upIdx] <= nums2[downIdx]) {
                    res[index] = nums1[upIdx++];
                } else if (downIdx < n) {
                    res[index] = nums2[downIdx++];
                }
            }
            else {
                res[index] = nums1[upIdx++];
            }

        }


        for(int i = 0; i< m + n; i++) {
            nums1[i] = res[i];
        }
    }
}
