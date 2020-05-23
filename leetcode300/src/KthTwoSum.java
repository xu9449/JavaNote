import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthTwoSum {
    public static void main(String[] args) {
        KthTwoSum s = new KthTwoSum();
        int[] A = {1, 4, 6, 8, 10};
        int[] B = {1, 4, 5, 7, 8};
        int k = 4;
        int result = s.kthTwoSum(A, B, k);
        System.out.println(result);

    }
    private int kthTwoSum(int[] A, int[] B, int k) {
        //corner case
        if (k == 0) {
            return -1;
        }
        int aIndex = 0;
        int bIndex = 0;
        int m = A.length;
        int n = B.length;
        Queue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == o2) {
                    return 0;
                } else return o1 > o2 ? -1 : 1;
            }
        });
        // put k elements into the pq
        int i = 0;
        int bb = 0;
        for(int j = 0; j < m; j++){

            if( i == k) {
                aIndex = j - 1;
                bIndex = bb;
                break;
            }
            for(int s = 0; s < m; s++){
                if(i == k) {
                    aIndex = j;
                    bIndex = s;
                    break;
                }
                pq.offer(A[j]+B[s]);
                i++;
                bb = s;
            }
        }

        // put m*n - k elements compare with pq.peek()
        while(aIndex < A.length){
            if(A[aIndex]+ B[bIndex] >= pq.peek()){
                break;
            }
            while(bIndex < B.length){
                if(A[aIndex] + B[bIndex] >= pq.peek()){
                    break;
                } else {
                    pq.offer(A[aIndex] + B[bIndex]);
                }
            }
            aIndex++;
            bIndex = 0;
        }
        // print out the pq's elements
        return pq.peek();

    }
}
