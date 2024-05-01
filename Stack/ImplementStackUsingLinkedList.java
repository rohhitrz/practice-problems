package Stack;

public class ImplementStackUsingLinkedList {

    Node head;

    boolean isEmpty(){
        return head==null;
    }

    void push(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    int  pop(){
        if(isEmpty()){
            System.out.println("cannot pop, take -1");
            return -1;
        }
        else {

            int val = head.data;
            head = head.next;

            return val;

        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("cannot pop, take -1");
            return -1;
        }

        else{
            return head.data;
        }

    }


    void printStack(){
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();

    }





    private class Node{
        int data;

        Node next;

        public Node(int data){
            this.data= data;

        }

    }
}
