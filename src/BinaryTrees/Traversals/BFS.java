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

public class BFS {
    
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            System.out.println(q.peek().val);
            Node curr = q.remove();
            if(curr.left!=null || curr.right!=null){
                q.add(curr.left);
                q.add(curr.right);
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
        
        bfs(head);
    }
}