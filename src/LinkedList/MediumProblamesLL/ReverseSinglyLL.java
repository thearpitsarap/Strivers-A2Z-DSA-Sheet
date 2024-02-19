package LinkedList.MediumProblamesLL;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class ReverseSinglyLL {
    public static Node reverseList(Node head) {
        Node curr = head;
        Node nxt = null;
        Node prev = null;

        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {1,2,3,4,5};
        Node head = cl.constructLL(nums);
        Node newHead = reverseList(head);
        TraverseLinkedList.traverse(newHead);
    }
}