package LinkedList.MediumProblamesLL;
import java.math.*;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class AddTwoNumbers {

    public static Node addTwoNumbers(Node l1, Node l2) {
        FormLinkedList fl = new FormLinkedList();
        Node newHead = fl.new Node(-1);

        String s1 = "";
        Node n1 = l1;
        while(n1!=null){
            s1+=n1.data;
            n1=n1.next;
        }
        StringBuilder s11 = new StringBuilder(s1).reverse();

        String s2 = "";
        Node n2 = l2;
        while(n2!=null){
            s2+=n2.data;
            n2=n2.next;
        }
        StringBuilder s22 = new StringBuilder(s2).reverse();

        String s111 = s11.toString();
        String s222 = s22.toString();
        BigInteger bi1 = new BigInteger(s111) ;
        BigInteger bi2 = new BigInteger(s222) ;

        BigInteger s3 = bi1.add(bi2);
        String s4 = s3.toString();
        System.out.println(s4);

        Node n3 = fl.new Node(s4.charAt(s4.length()-1)-'0');
        newHead=n3;
        for(int i=s4.length()-2;i>=0;i--){
            Node t = fl.new Node(s4.charAt(i)-'0');
            n3.next=t;
            n3=n3.next;
        }

        return newHead;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {2,4,9};
        int[] nums1 = {5,6,4,9};
        Node head = cl.constructLL(nums);
        Node head2 = cl.constructLL(nums1);
        Node newHead = addTwoNumbers(head,head2);
        TraverseLinkedList.traverse(newHead);
    }
}