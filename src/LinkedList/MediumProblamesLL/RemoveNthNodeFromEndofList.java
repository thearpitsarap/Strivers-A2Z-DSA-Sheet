package LinkedList.MediumProblamesLL;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class RemoveNthNodeFromEndofList {
    public static Node removeNthFromEnd(Node head, int n) {
        if(head==null){
            return null;
        }
        Node fast = head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        Node slow = head;
        if(fast==null){
            return head.next;
        }
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {1,2,3,4,5};
        Node head = cl.constructLL(nums);
        Node newHead = removeNthFromEnd(head,2);
        TraverseLinkedList.traverse(newHead);
    }
}