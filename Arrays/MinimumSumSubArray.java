package Arrays;

public class MinimumSumSubArray {


    static  int minSubArray(int arr[], int target){
        int l=0,r=0;
        int csum =0;
        int n = arr.length;

        int minLength = Integer.MAX_VALUE;

        while(r<n){
            csum += arr[r];

            while(csum>=target){
                minLength = Math.min(minLength, r-l+1);
                csum -=arr[l];
                l++;
    }
            r++;
        }

        if(minLength == Integer.MAX_VALUE){
            minLength=0;
        }
        return  minLength;


    }


}
