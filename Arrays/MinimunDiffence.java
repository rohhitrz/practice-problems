package Arrays;

import java.util.*;

public class MinimunDiffence {


    static  List<List<Integer>> minimumDiffrence(int arr[]){

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        int n=arr.length;
        int minDiffrence = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){

            minDiffrence = Math.min(minDiffrence, (arr[i]-arr[i-1]));
        }

        for (int i = 1; i < n; i++) {
            if((arr[i]-arr[i-1])==minDiffrence){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);

            }

        }
        return ans;



    }


    public static void main(String[] args) {

        int arr [] = {12, 9, 8, 2, 11};

        List<List<Integer>> ans;

        ans = minimumDiffrence(arr);

//        for(List<Integer> res : ans){}


        System.out.println(ans);

    }




}
