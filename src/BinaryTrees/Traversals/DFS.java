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

public class DFS {
    
    public static void trav(Node root){
        Stack<Node> st = new Stack<Node>();
        st.push(root);
        while(!st.isEmpty()){
            System.out.println(st.peek().val);
            Node curr = st.pop();
            if(curr.right!=null || curr.left!=null) {
             st.push(curr.right);
             st.push(curr.left);   
            }
        }
    }
    
    public static void main(String[] args) {
        Node head = new Node(55);
        head.left = new Node(44);
        head.left.left = new Node(77);
        head.left.right = new Node(99);
        head.right = new Node(88);
        head.right.left = new Node(65);
        head.right.right = new Node(78);
        
        trav(head);
    }
}