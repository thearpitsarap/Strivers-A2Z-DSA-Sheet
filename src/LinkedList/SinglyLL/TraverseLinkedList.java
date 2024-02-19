package LinkedList.SinglyLL;

public class TraverseLinkedList {
        public static void ll(){
            CreateLinkedList tt = new CreateLinkedList();
            int[] nums  = {4, 2, 5, 1};
            Node temp = tt.constructLL(nums);
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        public void traverse(Node head){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }