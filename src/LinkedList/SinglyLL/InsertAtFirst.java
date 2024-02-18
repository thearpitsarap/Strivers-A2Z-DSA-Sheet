package LinkedList.SinglyLL;

public class InsertAtFirst {
    public static Node insertAtFirst(Node list, int newValue) {
        Node head = list;
        list = new Node(newValue);
        list.next = head;
        return list;
    }

    public static void main(String[] args) {
        CreateLinkedList tt = new CreateLinkedList();
        TraverseLinkedList t = new TraverseLinkedList();
        int[] nums  = {4, 2, 5, 1};
        Node head1 = tt.constructLL(nums);
        Node head2 = insertAtFirst(head1,8);
        t.traverse(head2);
    }
}