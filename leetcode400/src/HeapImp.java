import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapImp {

    public static void main(String[] args){
        List<Integer> abc;
        abc = new ArrayList<>();
//        String a1 = new String("abc");
//        String a2 = new String("abc");
        // a.add(a1);
        //a.add(a2);
//        System.out.println(a);
//        a.remove(a2);
//        System.out.println(a);
//        Integer a = new Integer(100);
//        Integer b = new Integer(100);
        Integer c = 1000;
        Integer d = 1000;
        //System.out.println(c ==d);
        abc.add(c);
        System.out.println(abc);
        abc.remove(d);
        System.out.println(abc);
    }
//    private static Integer[] array = {2,4,5,6};
//    private static Integer[] newArray = new Integer[array.length * 2];
//
//    private int size;
//
//
//    public static void main(String[] args) {
////        newArray = Arrays.copyOfRange(array, 0, array.length);
//        System.out.println(Arrays.toString(newArray));
//    }
//    public HeapImp() {
//        if (array == null || array.length == 0) {
//            throw new IllegalArgumentException("input array can not be null or empty");
//        }
//        this.array = array;
//        size = array.length;
//        heapify();
//    }
//
//    public void heapify() {
//        for(int i = size/2 -1; i >= 0; i--){
//            percolateDown(i);
//        }
//    }



//    public void percolateUp(int index){
//        while(index > 0){
//            int parentIndex = (index - 1)/2;
//            if(array[parentIndex] > array[index]){
//                swap(array, parentIndex, index);
//            } else {
//                break;
//            }
//            index = parentIndex;
//        }
//    }

//    public void percolateDown(int index) {
//        while(index <= size/2 -1) {
//            int leftChild = index * 2 + 1;
//            int rightChild = index * 2 + 2;
//            int swapCandidate = leftChild;
//            // 判断有没有右子树的方式 <= size - 1
//            if (rightChild <= size - 1 && array[rightChild] <= array[leftChild]) {
//                swapCandidate = rightChild;
//            }
//            if (array[index] > array[swapCandidate]) {
//                swap(array, index, swapCandidate);
//            } else {
//                break;
//            }
//            index = swapCandidate;
//        }
//    }

//    public void swap(int[] array, int a, int b){
//        int tmp = array[a];
//        array[a] = array[b];
//        array[b] = tmp;
//    }
}
