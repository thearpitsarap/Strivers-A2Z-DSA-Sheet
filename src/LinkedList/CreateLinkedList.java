package LinkedList;

public class CreateLinkedList {
    public Node constructLL(int []nums) {
        Node y = new Node(nums[0]);
        Node mover =y;
        for(int i=1;i<nums.length;i++){
            Node x = new Node(nums[i]);
            mover.next = x;
            mover = x;
        }
        return y;
    }
}