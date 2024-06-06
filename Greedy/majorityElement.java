package Greedy;
import  java.util.*;

public class majorityElement {

    // majority element with brute force


    public static void main(String[] args) {
        int[] nums = {1};

        try {
            int majorityElement = findMajorityElement(nums);
            System.out.println("The majority element is: " + majorityElement);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }



    static  int findMajorityElement(int [] arr){

        Arrays.sort(arr);

        int count=1;
        int maxCount = 0;
        int majority = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                count=1;
            }

            if(count > maxCount){
                maxCount = count;
                majority = arr[i];
            }

            if(maxCount >= (arr.length/2)){
                return majority;
            }
        }
        return  -1;
    }


}
