package BinaryTrees.Traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node{
    int val;
    Node left,right;
    
    Node(int v){
        val=v;
        left=null;
        right=null;
    }
}

public class PostOrderOneStack {
    public static List<Integer> postorderTraversal(Node root) {
        Stack<Node> st = new Stack<>();
        List<Integer> li = new ArrayList<>();

        Node curr = root;
        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            else{
                Node temp = st.peek().right;
                if(temp==null){
                    temp=st.pop();
                    li.add(temp.val);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp=st.pop();
                        li.add(temp.val);
                    }
                }
                else{
                    curr=temp;
                }
            }
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