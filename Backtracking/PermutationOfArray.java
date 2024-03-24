package Backtracking;

import java.util.ArrayList;

public class PermutationOfArray {

    public static void main(String[] args) {
        int arr [] = {1,2,3};
//        printArray(arr);
        ArrayList<int[]> ans = new ArrayList<>();

        permute(arr,0,arr.length-1,ans);
//        printArray(arr);

        for(int [] res : ans){
            printArray(res);

        }

    }

    static void permute(int arr[], int left, int right, ArrayList<int[]> ans){
        if(left==right){
            printArray(arr);
            ans.add(arr);
            return;
        }
        for(int i=left;i<=right;i++) {
            swap(arr, i, left);
            permute(arr, left + 1, right,ans);

            swap(arr, i, left); //Backtracking
        }



    }


    static void swap(int arr[], int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }


    static void printArray(int arr[]){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

}
