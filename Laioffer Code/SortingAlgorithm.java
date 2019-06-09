import java.util.Arrays;

public class SortingAlgorithm {
    public static void main(String[] args) {
        SortingAlgorithm solution = new SortingAlgorithm();
        int[] test = {2, 4, 5, 7, 1, 2, 3, 6};
        int[] result = solution.mergeSort(test);
        System.out.println(Arrays.toString(result));

    }

    public int[] SelectionSort(int[] array) {

        int length = array.length;

        for (int left = 0; left < length; left++) {
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




    public int[] mergeSort(int[] array) {

        if (array == null) {
            return array;
        }

        mergeSort(array, 0, array.length - 1);
        return array;
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }




    public void merge(int[] array, int left, int mid, int right) {

        int [] newArr = new int[array.length];
        for (int i = 0; i <= right; i ++) {
            newArr[i] = array[i];
        }

        int leftIndex = left;
        int rightIndex = mid + 1;


        while(leftIndex <= mid && rightIndex <= right) { // 为什么此处我用if就不可以

            if ( newArr[leftIndex] <= newArr[rightIndex]) {
                array[left++] = newArr[leftIndex++];
            }
            else {
                array[left++] = newArr[rightIndex++];

            }
        }
        while (leftIndex <= mid) {
            array[left++] = newArr[leftIndex++];
        }
    }
}

// 总结：没有check null的情况
// while 会执行多次，而if只会检查一次然后就执行下面的语句