package StackAndQueue;

public class QueueUsingArray {
    int[] arr = new int[6];
    int rear = 0;
    int front = 0;
    int c = 0;

    public void enqueue(int num){
        if(c==arr.length){
            System.out.println("Queue full");
        }
        else{
            arr[rear % arr.length] = num;
            rear++;
            c++;
        }
    }

    public void dequeue(){
        if(c<0){
            System.out.println("Empty Queue");
        }
        else{
            System.out.println(arr[front]);
            front++;
            c--;
        }
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.enqueue(8);
        q.enqueue(6);
        q.enqueue(7);
        q.dequeue();
        q.enqueue(9);
        q.dequeue();
        q.enqueue(10);
        q.enqueue(18);
    }
}