package LinkedList.MediumProblamesLL;

import LinkedList.DoublyLL.FormLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class AddTwoNumbersOptimised {
    public Node addTwoNumbers(Node l1, Node l2) {
        FormLinkedList fl = new FormLinkedList();

        Node n1 = l1;
        Node n2 = l2;

        Node n3 = fl.new Node(-1);
        Node temp = n3;
        int carry = 0;

        while(n1!=null && n2!=null){
            if(n1.data+n2.data+carry>9){
                n3.next = fl.new Node((n1.data+n2.data+carry)%10);
                carry = (n1.data+n2.data+carry)/10;
            }
            else{
                n3.next = fl.new Node(n1.data+n2.data+carry);
                carry=0;
            }
            n1=n1.next;
            n2=n2.next;
            n3=n3.next;
        }

        if(n1!=null){
            while(n1!=null){
                if(n1.data+carry>9){
                    n3.next=fl.new Node((n1.data+carry)%10);
                    carry=(n1.data+carry)/10;
                }
                else{
                    n3.next = fl.new Node(n1.data+carry);
                    carry=0;
                }
                
                n3=n3.next;
                n1=n1.next;
            }
        }
        else if(n2!=null){
            while(n2!=null){
                if(n2.data+carry>9){
                    n3.next=fl.new Node((n2.data+carry)%10);
                    carry=(n2.data+carry)/10;
                }
                else{
                    n3.next = fl.new Node(n2.data+carry);
                    carry=0;
                }
                
                n3=n3.next;
                n2=n2.next;
            }
        }
        if(carry!=0){
            n3.next = fl.new Node(carry);
        }

        return temp.next;
    }
}