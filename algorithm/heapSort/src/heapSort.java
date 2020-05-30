import java.util.*;

/*
1. Define the nature order: element have implement the comparable interface
    eg. Integer implements Comparable<Integer>
    eg. Collection.reverseOrder();

2. Provide the extra Comparator

i.    PriorityQueue<Cell> heap = new PriorityQueue<Cell>();
        -default capacity(11)
ii.   PriorityQueue<Cell> heap = new PriorityQueue<Cell>(16);
iii.  PriorityQueue<Cell> heap = new PriorityQueue<Cell>(16, new MyComparator());
iv.   PriorityQueue<Cell> heap = new PriorityQueue<Cell>(new MyComparator());
        - Java 8 only

3. Anonymous inner class
    i. anonymous
    ii. lambda
 */

public class heapSort {
    public static void main(String[] args) {

//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        minHeap.offer(4);
//        minHeap.offer(5);
//        minHeap.offer(2);
//        minHeap.offer(1);
//        minHeap.offer(-4);
//
//        while (!minHeap.isEmpty()){
//            System.out.println(minHeap.poll());
//        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<Cell> minHeap = new PriorityQueue<>();
        Cell c1 = new Cell(3, 1, 0);
        Cell c2 = new Cell(2, 3, 1);
        Cell c3 = new Cell(1, 2, 2);
        minHeap.offer(c1);
        minHeap.offer(c2);
        minHeap.offer(c3);

        PriorityQueue<Cell> rowMinHeap = new PriorityQueue<>(new CompareRow());
        rowMinHeap.offer(c1);
        rowMinHeap.offer(c2);
        rowMinHeap.offer(c3);

        PriorityQueue<Cell> colMinHeap = new PriorityQueue<>(16, new Comparator<Cell>() {
            @Override
            public int compare(Cell o1, Cell o2) {
                if(o1.col == o2.col){
                    return 0;
                }
                return o1.col < o2.col ? -1:1;

            }
        });
        colMinHeap.offer(c1);
        colMinHeap.offer(c2);
        colMinHeap.offer(c3);

        PriorityQueue<Cell> colMinHeap2 = new PriorityQueue<>(16, (Cell d1, Cell d2) -> {
            if(d1.col == d2.col){
                return 0;
            }
            return d1.col < d2.col ? -1:1;
        });

        colMinHeap2.offer(c1);
        colMinHeap2.offer(c2);
        colMinHeap2.offer(c3);


        while (!minHeap.isEmpty()){
            System.out.println(minHeap.poll().value);
        }

        while (!rowMinHeap.isEmpty()){
            System.out.println(rowMinHeap.poll().value);
        }

        while (!colMinHeap.isEmpty()){
            System.out.println(colMinHeap.poll().value);
        }

        while (!colMinHeap2.isEmpty()){
            System.out.println(colMinHeap2.poll().value);
        }
    }
}

class Cell implements Comparable<Cell> {
    public int row;
    public int col;
    public int value;
    public Cell(int row, int col, int value){
        this.row = row;
        this.col = col;
        this.value = value;
    }

    @Override
    public int compareTo(Cell another) {
        if(this.value == another.value){
            return 0;
        }
        return this.value < another.value ? -1: 1;
    }
}







    public List<Integer> kSmallestElment(List<Integer> input, int k) {
        if (k <= 0) return new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int i = 0; i < input.size(); i++) {
            if (pq.size() < k) {
                pq.add(input.get(i));
            } else {
                int peek = pq.peek();
                if (peek > input.get(i)) {
                    pq.poll();
                    pq.offer(input.get(i));
                }
            }
        }
        int[] tmp = new int[k];
        while (!pq.isEmpty()) {
            tmp[k--] = pq.poll();
        }
        List<Integer> result = new ArrayList<>(tmp.length);
        for (int i : tmp) {
            result.add(i);
        }
        return result;
    }
}

class CompareRow implements Comparator<Cell> {
    @Override
    public int compare(Cell c1, Cell c2) {
        if (c1.row == c2.row) {
            return 0;
        }
        return c1.row < c2.row ? -1 : 1;
    }
}
