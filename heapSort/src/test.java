import java.util.PriorityQueue;

public class test {



    public static void main(String[] args) {
        PriorityQueue<Cell> pq = new PriorityQueue<>(new CompareRow());
        Cell c1 = new Cell(0, 2, 1);
        pq.offer(c1);
    }

    public void sf (){
        PriorityQueue<Cell> pa = new PriorityQueue<>(new CompareRow());
    }

}
