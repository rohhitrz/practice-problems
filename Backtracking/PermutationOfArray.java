package Backtracking;

public class PermutationOfArray {

    public static void main(String[] args) {
        int arr [] = {1,2,3};
//        printArray(arr);

        permute(arr,0,arr.length-1);
//        printArray(arr);

    }

    static void permute(int arr[], int left, int right){
        if(left==right){
            printArray(arr);
            return;
        }
        for(int i=left;i<=right;i++) {
            swap(arr, i, left);
            permute(arr, left + 1, right);

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
