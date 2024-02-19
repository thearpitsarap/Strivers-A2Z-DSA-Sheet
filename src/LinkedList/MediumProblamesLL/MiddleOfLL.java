package LinkedList.MediumProblamesLL;
import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class MiddleOfLL {
    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        CreateLinkedList cl = new CreateLinkedList();
        Node head = cl.constructLL(nums);
        Node mid = middleNode(head);
        System.out.println(mid.data);
    }
}