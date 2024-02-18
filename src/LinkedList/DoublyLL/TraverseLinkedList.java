package LinkedList.DoublyLL;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class TraverseLinkedList {
    public static void printLL(int[] nums){
        CreateLinkedList x = new CreateLinkedList();
        Node head = x.constructLL(nums);

        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }

    public static void traverse(Node head){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
}