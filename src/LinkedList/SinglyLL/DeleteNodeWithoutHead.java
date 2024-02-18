package LinkedList.SinglyLL;

public class DeleteNodeWithoutHead {

    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        TraverseLinkedList tl = new TraverseLinkedList();

        int[] nums = {4,5,1,9};
        Node temp = cl.constructLL(nums);
        deleteNode(temp);
        tl.traverse(temp);
    }
}