package LinkedList.MediumProblamesLL;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class InterSectionOfTwoLinkedList {
    public static Node getIntersectionNode(Node headA, Node headB) {
        if(headA==null || headB==null){
            return null;
        }
        Node one = headA;
        Node two = headB;

        while(one != two){
            one=one.next;
            two=two.next;

            if(one==two){
                return one;
            }

            if(one==null){
                one = headB;
            }
            else if(two==null){
                two = headA;
            }
        }
        return one;
    }

    public static void main(String[] args) {
        CreateLinkedList cl = new CreateLinkedList();
        int[] nums = {4,1,8,4,5};
        int[] nums2 = {5,6,1,8,4,5};
        Node head = cl.constructLL(nums);
        Node head1 = cl.constructLL(nums2);
        Node newHead = getIntersectionNode(head,head1);
        TraverseLinkedList.traverse(newHead);
    }
}