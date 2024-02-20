package LinkedList.MediumProblamesLL;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class PalindromeLinkedList {
    public static boolean isPalindrome(Node head) {

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        Node n = slow;
        Node prev = null;
        Node nxt = null;

        while(n!=null){
            nxt = n.next;
            n.next = prev;
            prev = n;
            n = nxt;
        }

        Node jj = prev;
        Node hh = head;
        while(jj!=null){
            if(hh.data != jj.data){
                return false;
            }
            jj=jj.next;
            hh=hh.next;
        }
         
        return true;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {1,2,3,2,1};
        Node head = cl.constructLL(nums);
        boolean newHead = isPalindrome(head);
        System.out.println(newHead);
    }
}