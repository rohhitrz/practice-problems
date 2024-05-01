package Stack;

public class StackUisngArrayMain {
    public static void main(String[] args) {

         ImplementStackUsingLinkedList st = new ImplementStackUsingLinkedList ();


        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.push(50);

        st.printStack();

       int peekElement= st.peek();
        System.out.println("the peek Element is: "+peekElement);

        int x =st.pop();
        System.out.println(x);
        int y =st.pop();
        System.out.println(y);
        int z =st.pop();
        System.out.println(z);
        int w =st.pop();
        System.out.println(w);

        int p = st.pop();
        System.out.println(p);



        boolean res2=  st.isEmpty();
        System.out.println(res2);






    }
}
