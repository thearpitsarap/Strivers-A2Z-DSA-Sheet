package LinkedList.MediumProblamesOfDLL;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;
import LinkedList.MediumProblamesLL.TraverseLinkedList;

public class RemoveDuplicates {
    public static Node uniqueSortedList(Node head) {
        Node n = head.next;
        while(n!=null){
            if(n.prev.data==n.data){
                n.next=n.next.next;
            }
            n=n.next;
        }
        return head;
    }
    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {1,2,2,2,3};
        Node head = cl.constructLL(nums);
        Node newHead = uniqueSortedList(head);
        TraverseLinkedList.traverse(newHead);
    }   
}