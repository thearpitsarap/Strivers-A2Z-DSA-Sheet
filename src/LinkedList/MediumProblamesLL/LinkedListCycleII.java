package LinkedList.MediumProblamesLL;

import java.util.ArrayList;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class LinkedListCycleII {
    public static Node detectCycle(Node head) {
        ArrayList<Node> li = new ArrayList<>();

        Node slow = head;
        Node fast = head;
        Node temp = null;

        while(fast!=null && fast.next!=null){
            if(li.contains(slow)){
                temp=slow;
                break;
            }
            li.add(slow);
            slow=slow.next;
            fast=fast.next.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        CreateLinkedList cl = new CreateLinkedList();
        Node head = cl.constructLL(nums);
        Node ans = detectCycle(head);
        System.out.println(ans.data);
    }
}