import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort solution = new QuickSort();
        int[] array = new int[] {1, 3, 1, 2, 3, 1, 3};
        int[] result = solution.quickSort(array);
        System.out.print(Arrays.toString(result));
    }

    public int[] quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);
        swap(array, pivotIndex, right);

        int l = left, r = right - 1;
        while (l <= r) {
            if (array[l] <= array[right]) {
                l++;
            } else {
                swap(array, l, r);
                r--;
            }
        }

        swap(array, right, l);

        quickSort(array, left, l - 1);
        quickSort(array, l + 1, right);

    }
        private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
