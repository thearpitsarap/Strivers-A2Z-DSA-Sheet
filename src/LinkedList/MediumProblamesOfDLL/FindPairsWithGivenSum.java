package LinkedList.MediumProblamesOfDLL;

import java.util.ArrayList;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class FindPairsWithGivenSum {
    public static ArrayList<int[]> findPairs(Node head, int k) {
        ArrayList<int[]> ans = new ArrayList<>();
        Node last = head;
        while(last.next!=null){
            last=last.next;
        } 
        Node n = head;
        while(n.data<last.data){
            if(n.data+last.data==k){
                int[] arr = new int[2];
                arr[0]=n.data;
                arr[1]=last.data;
                ans.add(arr);
               n=n.next;
               last=last.prev;
            }
            else if(n.data+last.data < k){
                n=n.next;
            }
            else {
                last = last.prev;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {1,10,11,12,27};
        Node head = cl.constructLL(nums);
        ArrayList<int[]> newHead = findPairs(head,7);
        System.out.println(newHead);
    }
}