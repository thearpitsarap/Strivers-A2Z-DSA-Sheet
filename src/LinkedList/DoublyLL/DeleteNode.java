package LinkedList.DoublyLL;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class DeleteNode {
    public static Node deleteLastNode(Node head) {
    
        if(head.next==null){
            return null;
        }

        Node n = head;
        while(n.next.next!=null){
            n=n.next;
        }
        n.next=null;
        return head;
    }

    public static void main(String[] args) {
        CreateLinkedList x = new CreateLinkedList();
        int[] nums = {4, 10, 3, 5};
        Node head = x.constructLL(nums);
        deleteLastNode(head);
        TraverseLinkedList.traverse(head);
    }
}