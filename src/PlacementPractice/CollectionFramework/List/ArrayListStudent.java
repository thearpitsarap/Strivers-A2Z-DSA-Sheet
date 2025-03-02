package PlacementPractice.CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListStudent {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(3);
        li.add(2);

        Iterator<Integer> it = li.listIterator(2);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}