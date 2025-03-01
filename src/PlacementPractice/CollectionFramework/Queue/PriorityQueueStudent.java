package PlacementPractice.CollectionFramework.Queue;
import java.util.PriorityQueue;

public class PriorityQueueStudent {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(1);
        pq.add(3);
        //elements are stored in sorted order in PQ
        //2->
        //1->2
        //1->2->3
        //here when you apply pq.poll() it removes and returns smallest element
        //i.e element at head
        //it doesn't follow fifo
        System.out.println(pq.poll());
        pq.add(4);
        System.out.println(pq.peek());
    }
}