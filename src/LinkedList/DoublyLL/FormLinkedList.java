package LinkedList.DoublyLL;

public class FormLinkedList {
    
    public class Node {

        public int data;
        public Node next;
        public Node back;
    
        Node() {
            this.data = 0;
            this.next = null;
            this.back = null;
        }
    
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.back = null;
        }
    
        public Node(int data, Node next, Node back) {
            this.data = data;
            this.next = next;
            this.back = back;
        }
    };

}