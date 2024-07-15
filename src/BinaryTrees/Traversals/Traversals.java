package BinaryTrees.Traversals;

class Node{
    int key;
    Node left;
    Node right;

    Node(int key){
        this.key=key;
        left = right = null;
    }
}

public class Traversals {
    public static void main(String[] args) {
        Node head = new Node(55);
        head.left = new Node(44);
        head.right = new Node(88);
        
        System.out.println(head.key);
        System.out.println(head.left.key);
        System.out.println(head.right.key);
    }
}