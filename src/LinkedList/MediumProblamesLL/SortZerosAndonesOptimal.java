package LinkedList.MediumProblamesLL;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class SortZerosAndonesOptimal {
    public static Node sortList(Node head) {
        FormLinkedList fl = new FormLinkedList();
        Node d1 = fl.new Node(-1);
        Node d2 = fl.new Node(-1);
        Node d3 = fl.new Node(-1);

        Node s = d1;
        Node s1 = d2;
        Node s2 = d3;

        Node n = head;
        while(n!=null){
            if(n.data==0){
                d1.next=n;
                d1=d1.next;
            }
            else if(n.data==1){
                d2.next=n;
                d2=d2.next;
            }
            else if(n.data==2){
                d3.next=n;
                d3=d3.next;
            }
            n=n.next;
        }
        
        d1.next = s1.next;
        d2.next = s2.next;
        d3.next=null;

        return s.next;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {1,2,0,0,1,1,2,0,1};
        Node head = cl.constructLL(nums);
        Node newHead = sortList(head);
        TraverseLinkedList.traverse(newHead);
    }
}