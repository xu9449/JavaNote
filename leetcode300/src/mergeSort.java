public class mergeSort {

    public static void main(String[] args) {
        mergeSort s = new mergeSort();
        int[] arr = {3, 5, 6, 2, 7, 9};
        int[] result = s.mergeSort(arr);
        System.out.println(result.toString());
    }

    public int[] mergeSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int[] help = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, help);
        return arr;
    }

    public void mergeSort(int[] arr, int left, int right, int[] help) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid, help);
        mergeSort(arr, mid + 1, right, help);
        merge(arr, left, mid, right, help);


    }

    public void merge(int[] array, int left, int mid, int right, int[] help) {
        for (int i = left; i <= right; i++) {
            help[i] = array[i];
        }
        int leftIndex = left;
        int midIndex = mid+1;
        while (leftIndex <= mid && midIndex <= right) {
            if (help[leftIndex] <= help[midIndex]) {
                array[left++] = help[leftIndex++];
            } else {
                array[left++] = help[midIndex++];
            }
        }
        while (leftIndex <= mid) {
            array[left] = help[leftIndex];
            left++;
            leftIndex++;
        }

    }
}
