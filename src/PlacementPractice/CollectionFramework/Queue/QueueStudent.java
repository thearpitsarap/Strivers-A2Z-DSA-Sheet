package PlacementPractice.CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudent {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(1);
        q.add(3);
        q.poll();
        for(Integer a:q){
            System.out.println(a);
        }
        System.out.println(q.peek());
    }
}