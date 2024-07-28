package BinaryTrees.Traversals;
import java.util.*;

class Node{
    int val;
    Node left,right;
    
    Node(int v){
        val=v;
        left=null;
        right=null;
    }
}

public class PostOrderTwoStacks {
    
    public static List<Integer> postorderTraversal(Node root) {
        Stack<Node> st = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        List<Integer> li = new ArrayList<>();
        st.push(root);

        while(!st.isEmpty()){
            Node curr = st.pop();
            if(curr!=null){
                if(curr.left!=null || curr.right!=null){
                st.add(curr.left);
                st.add(curr.right);
            }
            st2.add(curr);
            }
        }
        while(!st2.isEmpty()){
            li.add(st2.pop().val);
        }
        return li;
    }
    
    public static void main(String[] args) {
        Node head = new Node(55);
        head.left = new Node(44);
        head.left.left = new Node(77);
        head.left.right = new Node(99);
        head.right = new Node(88);
        head.right.left = new Node(65);
        head.right.right = new Node(78);
        
        List<Integer> li1 = postorderTraversal(head);
        System.out.println(li1);
    }
}