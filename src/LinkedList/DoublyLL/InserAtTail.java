package LinkedList.DoublyLL;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class InserAtTail {
    public static Node insertAtTail(Node list, int K) {
        
        FormLinkedList t = new FormLinkedList();
        if(list==null){
            return t.new Node(K);
        }

        Node nw = t.new Node(K);
        Node n = list;
        while(n.next!=null){
            n=n.next;
        }
        n.next=nw;
        return list;
    }

    public static void main(String[] args) {
        CreateLinkedList x = new CreateLinkedList();
        int[] nums = {4, 10, 3, 5};
        Node head = x.constructLL(nums);

        insertAtTail(head, 560);
        
    }
}
