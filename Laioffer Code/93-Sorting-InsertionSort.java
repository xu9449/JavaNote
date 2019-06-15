import java.util.Arrays;

public class SortingAlgorithm {
    public static void main(String[] args) {
        SortingAlgorithm solution = new SortingAlgorithm();
        int[] test = {2, 4, 5, 7, 1, 2, 3, 6};
        int[] result = solution.insertSort(test);
        System.out.println(Arrays.toString(result));

    }

    public int[] insertSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                /*int helper = array[j];
                array[j] = array[i];
                array[i] = helper;
                j++;
                */
                array[i + 1] = array[i];
                i = i - 1 ;
                array[i + 1] = key;
            }
        }
        return array;
    }

}


// 总结：没有check null的情况
// while 会执行多次，而if只会检查一次然后就执行下面的语句
