package LinkedList;

class Node <T> {
    T data;
    Node next;
    Node(T data){
        this.data = data;
        this.next = null;
    }
    Node(T data, Node Next){
        this.data = data;
        this.next = null;
     }
}

public class LinkedList {
    static void printLL(Node head){

        Node  temp = head;
        while(temp !=null){
            System.out.print(temp.data);
            if(temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;

        }
    }

    static Node insertInLinkedList(int pos, int data, Node<Integer> head){

        int count =0;
        Node  newNode = new Node(data);
        Node temp = head;

        if(pos==0){

            newNode.next=head;
            return newNode;

        }

        for(int i=0;i<pos-1;i++){
                temp = temp.next;
            }
       newNode.next = temp.next;

       temp.next= newNode;


    return head;


    }

    static Node<Integer> deleteFromLinkedList(int pos,Node<Integer> head){

        Node<Integer> NewNode = head;
        Node<Integer> temp = head;
        if(pos==0){
            head = head.next;
            return head;
        }

        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
//        temp.next = null;
        temp.next = temp.next.next;


        return head;


    }


    static int count(Node head){
        int count=1;

        if(head == null){
            return 0;
        }

        Node temp = head;


        while(temp != null && temp.next !=null){
            count++;
            temp=temp.next;



        }
        int middle =count/2;

        return middle;
    }


    static Node reverseLL(Node head){
        if(head == null || head.next ==null){
            return  head;
        }


        Node prev = head;
        Node curr = head.next;
        head.next = null;

        while(curr != null){
            Node nextNode = curr.next;

            curr.next= prev;
            prev = curr;
            curr = nextNode;
 }

        return prev;


    }

    static Node reverseLLRecursively(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node subProbloem = reverseLLRecursively(head.next);
        head.next.next= head;
        head.next=null;

        return  subProbloem;


    }

    public static void main(String[] args) {

        Node<Integer> head = new Node<Integer>(10);
        Node<Integer> n1 = new Node<Integer>(20);
        Node<Integer> n2 = new Node<Integer>(30);
        Node<Integer> n3 = new Node<Integer>(40);
        Node<Integer> n4 = new Node<Integer>(50);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        printLL(head);
        System.out.println();
//       Node<Integer> newList = insertInLinkedList(0,90,head);
        try {


//            int countRes = count(head);
//
//            System.out.println(countRes);
//            Node<Integer> newList = deleteFromLinkedList(10, head);
//            printLL(newList);

            Node reverse =  reverseLL(head);
            printLL(reverse);


        }

        catch(Exception e){
            System.out.println("wana wao waao " + e);
        }











    }
}
