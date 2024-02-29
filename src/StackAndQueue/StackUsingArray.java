package StackAndQueue;

public class StackUsingArray {
    int temp = -1;
    int[] arr = new int[5];

    public boolean isFull(){
        if(temp==arr.length-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(temp==-1){
            return true;
        }
        return false;
    }

    public void push(int v){
        if(!isFull()){
            arr[temp+1] = v;
            temp++;
        }
        else{
            System.out.println("Stack full");
        }
    }

    public int top(){
        if(temp!=-1){
            return arr[temp];
        }
        return -1;
    }

    public int pop(){
        if(!isEmpty()){
            System.out.println(arr[temp]);
            temp--;
        }
        return -1;
    }

    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray();
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        System.out.println(st.top());
        st.push(3);
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
    }
}