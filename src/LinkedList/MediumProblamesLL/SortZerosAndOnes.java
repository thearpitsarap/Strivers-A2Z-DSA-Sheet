package LinkedList.MediumProblamesLL;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class SortZerosAndOnes {
    public static Node sortList(Node head) {
        int[] arr = new int[3];
        Node n = head;
        while(n!=null){
            if(n.data == 0){
                arr[0]+=1;
            }
            else if(n.data == 1){
                arr[1]+=1;
            }
            else if(n.data == 2){
                arr[2]+=1;
            }
            n=n.next;
        }

        int c = 0;
        Node n1 = head;
        while(c<3){
            for(int i=0;i<arr[c];i++){
                n1.data = c;
                n1=n1.next;
            }
            c++;
        }
        return head;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {1,2,0,1,2};
        Node head = cl.constructLL(nums);
        Node newHead = sortList(head);
        TraverseLinkedList.traverse(newHead);
    }
}