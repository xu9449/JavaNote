import java.util.NoSuchElementException;

public class Heapimplementation {
    public static void main(String[] args) {

    }

    private int[] array;
    private int size;

    public Heapimplementation(int[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Input array can not be null or empty");
        }
        this.array = array;
        this.size = array.length;
        heapify();
    }
    public Heapimplementation(int cap){
        if(cap <=0){
            throw new IllegalArgumentException("Capacity can not <= 0");
        }
        array = new int[cap];
        size = 0;
    }

    private int size() {
        return size;
    }

    private void heapify(){
        //一个heap， size/2 - 1的点需要perculate down
        for(int i = size/2 -1; i >= 0; i--){
            percolateDown(i);
        }
    }

    private void percolateDown(int index){
        while(index <= size/2 - 1){
            int leftChildIndex = index*2 + 1;
            int rightChildIndex = index*2 + 2;
            int swapCandidate = leftChildIndex;
            if(rightChildIndex<=size -1 & array[leftChildIndex]>= array[rightChildIndex]){
                swapCandidate = rightChildIndex;
            }
            if(array[index] > array[swapCandidate]){
                swap(array, index, swapCandidate);
            } else {
                break;
            }
            index = swapCandidate;
        }
    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public int peek() {
        if (size == 0) {
            return array[0];
        }
        return array[0];
    }

    public int poll() {
        if (size == 0) {
            throw new NoSuchElementException("heap is empty");
        }
        int result = array[0];
        array[0] = array[size - 1];
        size --;
        percolateDown(0);
        return result;

    }

    public void update(int index, int ele) {
        if (size == array.length) {
            int[] newArray = new int[(int) (array.length * 1.5)];
            newArray = array.clone();
        }
        size++;
        perculateUp(size - 1);
    }

    private void perculateUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) /2;
            if (array[parentIndex] > array[index] ) {
                swap(array, parentIndex, index);
            } else {
                break;
            }
            // update swapCandidate if right child exists and it is smaller than leftChildIndex
            index = parentIndex;
        }
    }


}




