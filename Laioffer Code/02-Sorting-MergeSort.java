02-复习    
    
 MergeSort 是一个recursion  
 一头扎到底，深度优先  
 
   
import java.util.Arrays;

public class SortingAlgorithm {
    public static void main(String[] args) {
        SortingAlgorithm solution = new SortingAlgorithm();
        int[] test = {2, 4, 5, 7, 1, 2, 3, 6};
        int[] result = solution.mergeSort(test);
        System.out.println(Arrays.toString(result));

    }

    public int[] mergeSort (int[] array) {
        /*
        int left = 0;
        int right = array.length - 1;
        int Middle = left + (right - left) / 2;

        mergeSort(array, left, Middle);
        mergeSort(array, Middle + 1, right);
        merge(array, left, right);
        */

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
        int Middle = left + (right - left) / 2;
        mergeSort(array, left, Middle);
        mergeSort(array, Middle + 1, right);
        merge(array, left, Middle, right);


    }

    private void merge (int[] array, int left, int mid, int right) {

        int[] newArr = new int[array.length];
        //for (int i = 0; i<= array.length - 1; i++) {
        for (int i = 0; i <= right; i ++) {
            newArr[i] = array[i];
        }

        //int leftIndex = 0;
        int leftIndex = left;
        int rightIndex = mid + 1;

        //if ( leftIndex <= mid && rightIndex <= array.length) {
        while ( leftIndex <= mid && rightIndex <= right) {

            if (newArr[leftIndex] <= newArr[rightIndex]) {
                array[left++] = newArr[leftIndex++];

            } else {
                array[left++] = newArr[rightIndex++];

            }
        }
            //if(leftIndex < mid) {
        while (leftIndex <= mid) {
                array[left++] = newArr[leftIndex++];
                }
            }
        }
