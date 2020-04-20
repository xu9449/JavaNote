import java.util.Arrays;

public class HeapImp {

    private static int[] array = {2,4,5,6};
    private static int[] array2 = new int[array.length * 2];

    private int size;


    public HeapImp() {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("input array can not be null or empty");
        }
        this.array = array;
        size = array.length;
        heapify();
    }

    public void heapify() {
        for(int i = size/2 -1; i >= 0; i--){
            percolateDown(i);
        }
    }



    public void percolateUp(int index){
        while(index > 0){
            int parentIndex = (index - 1)/2;
            if(array[parentIndex] > array[index]){
                swap(array, parentIndex, index);
            } else {
                break;
            }
            index = parentIndex;
        }
    }

    public void percolateDown(int index) {
        while(index <= size/2 -1) {
            int leftChild = index * 2 + 1;
            int rightChild = index * 2 + 2;
            int swapCandidate = leftChild;
            // 判断有没有右子树的方式 <= size - 1
            if (rightChild <= size - 1 && array[rightChild] <= array[leftChild]) {
                swapCandidate = rightChild;
            }
            if (array[index] > array[swapCandidate]) {
                swap(array, index, swapCandidate);
            } else {
                break;
            }
            index = swapCandidate;
        }
    }

    public void swap(int[] array, int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
