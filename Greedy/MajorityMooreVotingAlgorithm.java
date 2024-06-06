package Greedy;

public class MajorityMooreVotingAlgorithm {



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }


    static int majorityElement(int arr[]){
        int count =1;
        int majority = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) count++;
            else count--;

            if(count == 0){
                count =1;
                majority = arr[i];
       }


        }

        int freq = 0;
        for(int e: arr){
            if(e == majority) freq++;
        }

        return freq > arr.length/2? majority: -1;

    }

}
