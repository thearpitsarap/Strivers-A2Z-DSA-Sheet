package BinaryTrees.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int val;
    Node left,right;
    
    Node(int v){
        val=v;
        left=null;
        right=null;
    }
}

public class ZigZagLevelOrder {

    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        if(root==null){
            List<List<Integer>> ll = new ArrayList<>();
            return ll;
        }
        List<List<Integer>> li = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int y = 1;
        while (!q.isEmpty()) {
            ArrayList<Node> li1 = new ArrayList<>();
            ArrayList<Integer> li2 = new ArrayList<>();
            int j=0;
            while(!q.isEmpty()){
                li1.add(q.remove());
                if(li1.get(j)!=null){
                    li2.add(li1.get(j).val);
                }
                j++;
            }
            if(y%2==0){
                Collections.reverse(li2);
            }
            y++;
            for(int i = 0; i < li1.size(); i++){
                if(li1.get(i)!=null){
                    if(li1.get(i).left != null || li1.get(i).right != null){
                        q.add(li1.get(i).left);
                        q.add(li1.get(i).right);
                    }
                }
            }
            li.add(li2); 
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
        
        List<List<Integer>> li1 = zigzagLevelOrder(head);
        System.out.println(li1);
    }
    
}