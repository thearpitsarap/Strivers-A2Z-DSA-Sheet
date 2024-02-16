package LinkedList;

public class TraverseLinkedList {
    public static Node constructLL(int []nums) {
        Node y = new Node(nums[0]);
        Node mover =y;
        for(int i=1;i<nums.length;i++){
            Node x = new Node(nums[i]);
            mover.next = x;
            mover = x;
        }
        return y;
    } 
    
    public static void ll(){
        int[] nums  = {4, 2, 5, 1};
        Node temp = constructLL(nums);
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ll();
    }
}