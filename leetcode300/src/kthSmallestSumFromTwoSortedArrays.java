import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class kthSmallestSumFromTwoSortedArrays {

    public static void main(String[] args) {
        kthSmallestSumFromTwoSortedArrays s = new kthSmallestSumFromTwoSortedArrays();
        int[] a = {2,4,5};
        int[] b = {20, 40, 50};
        int result = s.kSmaalest(a, b, 2);
        System.out.println(result);
    }

    public int kSmaalest(int[] A, int[] B, int k){
        int m = A.length;
        int n = B.length;
        Set<Element> set = new HashSet<>();

        PriorityQueue<Element> minheap = new PriorityQueue<>(k, new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                if(o1.equals(o2)){
                    return 0;
                }
                return o1.sum< o2.sum? -1:1;
            }
        });

        Element cur = new Element(0, 0, A[0] + B[0]);
        minheap.offer(cur);
        set.add(cur);
        int result = A[0] + B[0];

        for(int i = 0; i < k; i++) {
            cur = minheap.poll();
            result = cur.sum;
            if(cur.x < m -1){
                Element next = new Element(cur.x + 1, cur.y, A[cur.x + 1] + B[cur.y]);
                if(set.add(next)){
                    minheap.offer(next);
                }
            }
            if(cur.y < n -1){
                Element next = new Element(cur.x, cur.y + 1, A[cur.x] + B[cur.y + 1]);
                if(set.add(next)){
                    minheap.offer(next);
                }
            }
        }
        return result;
    }
    public class Element{
        int x;
        int y;
        int sum;
        public Element(int x, int y, int sum){
            this.x = x;
            this.y = y;
            this.sum = sum;
        }
        @Override
        public boolean equals(Object obj) {
            if(this == obj) {
                return true;
            }
            if(!(obj instanceof Element)){
                return false;
            }
            Element other = (Element) obj;
            return this.x == other.x && this.y == other.y && this.sum == sum;
        }

        @Override
        public int hashCode(){
            return this.x * 31 * 31 + this.y * 31 + this.sum;
        }

    }
}
