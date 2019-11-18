import java.util.Arrays;

public class SelectionSort {

    public class SortingAlgorithm {

        public int[] SelectionSort(int[] array) {
            //check null before any other things
            // check other conditions
            if (array == null || array.length <= 1) {// 此处array.length <= 1 更好          return array;
            }
            int length = array.length;

            for (int left = 0; left < length - 1; left++) { //此处注意是length - 1
                int M = left;
                for (int right = left + 1; right < length; right ++) {
                    if (array[right] < array[M]) {
                        M = right;
                    }
                }
                int help = array[left];
                array[left] = array[M];
                array[M] = help;
            }
            return array;
        }
    }

    // 问题： 没有check array是null 或者length < 1
    // Time: O (n^2)
    // Space: O(1)
}
