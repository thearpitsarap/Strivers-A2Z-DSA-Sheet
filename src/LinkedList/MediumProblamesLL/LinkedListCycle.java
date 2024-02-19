package LinkedList.MediumProblamesLL;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class LinkedListCycle {

    public static boolean hasCycle(Node head) {
        if(head==null){
            return false;
        }
        boolean flag = false;
        Node slow = head;
        Node fast = head.next;

        while(slow!=null && fast!=null && fast.next!=null){
            if(slow==fast){
                flag=true;
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }

        return flag;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        CreateLinkedList cl = new CreateLinkedList();
        Node head = cl.constructLL(nums);
        System.out.println(hasCycle(head));
    }
}
