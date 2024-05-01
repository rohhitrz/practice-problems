package Stack;

import org.w3c.dom.ls.LSOutput;

public class StackUsingArray {

    int size;
    int arr[];

    int top;


   public StackUsingArray(int size){
       this.size=size;
       arr = new int[size];
       top=-1;
    }


    boolean push(int data){
       if(isFull()){
           System.out.println("Stack overflow");
           return false;
       }
       else{
           top++;
           arr[top] = data;
           return true;
       }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty, cannot pop anything, so giving you -1:");
            return -1;
        } else {
            int x = arr[top];
            top--;
            size--;
            return x;

        }
    }


    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty, cannot pop anything, so giving you -1:");
            return -1;
        } else {
           return arr[top];

        }
    }


    public  boolean isEmpty(){
      return (top== -1);
    }

    boolean isFull(){

       return top==size-1;
    }


    void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }




}

