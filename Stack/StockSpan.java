package Stack;


import java.util.ArrayDeque;

public class StockSpan {

    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,75,85};
        int arr2[]= {10,20,30,40,50};

      int s[] =  stockspan(arr2);

        for(int ele: s){
            System.out.print(ele+" ");
        }


    }

    static int [] stockspan(int arr[]){
        int n= arr.length;
        if(n==0){
            return null;
        }

        int s[]= new int[n];
        s[0]=1;

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        for(int i=1;i<n;i++) {
            while (!stack.isEmpty()) {
                int top = stack.peek();
                System.out.println("the value of top is "+top);
                if (arr[top] > arr[i]) {
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                s[i] = i+1;
            } else {

                s[i] = i - stack.peek();
            }

            stack.push(i);

        }
        return  s;
  }

}
