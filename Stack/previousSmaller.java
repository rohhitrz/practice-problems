package Stack;
import java.util.*;

public class previousSmaller {

    public static void main(String[] args) {
        int arr[] = {1,6,4,10,2,4};
        int ans[]= prevSmaller(arr);

        System.out.println(Arrays.toString(ans));


    }


    static int[] prevSmaller(int arr[]){

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = arr.length;

        int ans [] = new int[n];

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
            }

            stack.push(i);
        }
        return ans;

    }

}
