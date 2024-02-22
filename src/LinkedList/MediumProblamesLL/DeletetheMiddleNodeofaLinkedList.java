package LinkedList.MediumProblamesLL;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class DeletetheMiddleNodeofaLinkedList {
    public static Node deleteMiddle(Node head) {
        FormLinkedList fl = new FormLinkedList();
        if(head.next == null){
            return null;
        }

        Node temp = fl.new Node(0);
        temp.next = head;
        Node fast = head;

        while(fast != null && fast.next!=null){
            temp = temp.next;
            fast = fast.next.next;
        }
        temp.next= temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {1,2,3,4,5};
        Node head = cl.constructLL(nums);
        Node newHead = deleteMiddle(head);
        TraverseLinkedList.traverse(newHead);
    }
}