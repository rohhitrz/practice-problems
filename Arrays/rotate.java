package Arrays;

import java.util.Arrays;

public class rotate {


    static int[][] multipleRotations(int a[], int b[]){

        int n= a.length;
        int m = b.length;


        int ans[][] = new int[m][n];
        int temp[] = new int[2*n];
        for (int i=0; i<a.length ; i++) {
            temp[i]= a[i];
            temp[i+a.length] =a[i];

 }

        for(int i=0; i< m;i++){
            int offset = (b[i]% a.length);
            for(int j=0;j<a.length;j++){
                ans[i][j]= temp[j+offset];

            }

        }
        return ans;

    }


    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;

        }

    }


    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;

    }

    static void rotate(int arr[], int n) {


        for (int j = 0; j < n; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                swap(arr, i, i + 1);
            }



        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int rotate[] ={2,3};

        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        rotate(arr,3);


        System.out.println("multipleRotations result: ");
        int res [][] = multipleRotations(arr,rotate);

       for(int ans[]: res){
           System.out.print(Arrays.toString(ans));
           System.out.println();
       }




    }





}
