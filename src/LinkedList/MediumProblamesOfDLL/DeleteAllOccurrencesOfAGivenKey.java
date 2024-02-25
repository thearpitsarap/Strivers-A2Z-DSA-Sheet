package LinkedList.MediumProblamesOfDLL;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;
import LinkedList.MediumProblamesLL.TraverseLinkedList;

public class DeleteAllOccurrencesOfAGivenKey {
    public static Node deleteAllOccurrences(Node head, int k) {
        if(head==null){
            return head;
        }
        if(head.data==k){
            head=head.next;
        }

        Node n = head.next;
        while(n!=null){
            if(n.data==k && n.prev.data==k){
                return null;
            }
            else if(n.data==k ){
                n.prev.next=n.next;
            }
            n=n.next;
        }
        return head;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {1001,1001,1001,1001,1001,1001,1001,1001,1001,1001,1001,1001,1001,1001,1001,1001,1001,1001};
        Node head = cl.constructLL(nums);
        Node newHead = deleteAllOccurrences(head,1001);
        TraverseLinkedList.traverse(newHead);
    }
}