package LinkedList.MediumProblamesLL;

import java.util.ArrayList;

import LinkedList.DoublyLL.CreateLinkedList;
import LinkedList.DoublyLL.FormLinkedList.Node;

public class LengthOfLoop {
    public static int lengthOfLoop(Node head) {
        ArrayList<Node> li = new ArrayList<>();
        Node slow = head;
        int in = -1;
        int len = 0;
        while(slow!=null){
            if(li.contains(slow)){
                in = li.indexOf(slow);
                break;
            }
            len+=1;
            li.add(slow);
            slow=slow.next;
        }
        if(in == -1){
            return 0;
        }
        return len-in;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        CreateLinkedList cl = new CreateLinkedList();
        Node head = cl.constructLL(nums);
        int ans = lengthOfLoop(head);
        System.out.println(ans);
    }
}