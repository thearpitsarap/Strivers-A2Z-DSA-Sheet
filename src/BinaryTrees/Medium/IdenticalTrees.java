package BinaryTrees.Medium;

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

public class IdenticalTrees {
    
    public static List<Integer> bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        List<Integer> li = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            if(q.peek()!=null){
                li.add(q.peek().val);
            }
            else{
                li.add(null);
            }
            Node curr = q.remove();
            if(curr!=null){
                if(curr.left!=null || curr.right!=null){
                    q.add(curr.left);
                    q.add(curr.right);
                }
            }
        }
        return li;
    }

    public static boolean isSameTree(Node p, Node q) {
        List<Integer> li1 = bfs(p);
        List<Integer> li2 = bfs(q);

        boolean areIdentical1 = li1.equals(li2);
        return areIdentical1;
    }
    
    public static void main(String[] args) {
        Node head = new Node(55);
        head.left = new Node(44);
        head.left.left = new Node(77);
        head.left.right = new Node(99);
        head.right = new Node(88);
        head.right.left = new Node(65);
        head.right.right = new Node(78);

        Node head1 = new Node(55);
        head1.left = new Node(44);
        head1.left.left = new Node(77);
        head1.left.right = new Node(99);
        head1.right = new Node(88);
        head1.right.left = new Node(65);
        head1.right.right = new Node(78);
        
        System.out.println(isSameTree(head,head1));
    }
}