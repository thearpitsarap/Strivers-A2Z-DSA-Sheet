package Arrays.Easy;

import java.util.*;

public class Merge2SortedArray {
    public static List< Integer > sortedArray(int []a, int []b) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int element : a) {
            if(!list.contains(element)){
             list.add(element);   
            }
        }
        
        for(int element : b){
            if(!list.contains(element)){
               list.add(element); 
            }
        }
        
        Collections.sort(list);
        @SuppressWarnings("rawtypes")
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
       return list;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3};
        int[] b ={2, 2, 4};
        sortedArray(a,b);
    }
}
