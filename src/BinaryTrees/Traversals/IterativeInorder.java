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

public class IterativeInorder {
    
    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> li = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        
        while(curr != null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr = st.pop();
            li.add(curr.val);
            curr = curr.right;
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
        
        List<Integer> li1 = inorderTraversal(head);
        System.out.println(li1);
    }
}