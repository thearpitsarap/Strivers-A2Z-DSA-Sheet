package LinkedList.DoublyLL;

import LinkedList.DoublyLL.FormLinkedList.Node;

public class CreateLinkedList {
    public Node constructLL(int []nums) {
        FormLinkedList t = new FormLinkedList();
        Node head = t.new Node(nums[0]);

        Node mover =head;
        for(int i=1;i<nums.length;i++){
            Node x = t.new Node(nums[i]);
            mover.next = x;
            mover.back = head;
            mover = x;
        }
        // mover.next = head;  this is for creating LL having Loop
        return head;
    }
}