package LinkedList.MediumProblamesLL;

import java.math.BigInteger;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class AddoneToANumberRepresentedAsLinkedList {

    public static Node addOne(Node head) {
        FormLinkedList fl = new FormLinkedList();

		String s = "";
		Node n = head;
		while(n!=null){
			s+=Integer.toString(n.data);
			n=n.next;
		}
		BigInteger s2 = new BigInteger(s);
		BigInteger y =  BigInteger.valueOf(1);
		s2= s2.add(y);
		String s3 = s2.toString();

		int t = 0;
		Node n2 = head;
		while(t<s3.length()){
			if(n2.next==null && t+1!=s3.length()){
				Node n3 = fl.new Node(s3.charAt(t) -'0');
				n2.next=n3;
			}
			int d = s3.charAt(t) -'0';
			if(n2.data!=d){
				n2.data=d;
			}
			t++;
			n2=n2.next;
		}

		return head; 
	}
    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {1,2,3,2,1};
        Node head = cl.constructLL(nums);
        Node newHead = addOne(head);
        TraverseLinkedList.traverse(newHead);
    }
}
