package random;

public class random5 {

    static int findMissingPositive(int arr[]){
        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]*=-1;
            }

            if(arr[i]> max){
                max =arr[i];
            }
            if(arr[i]< min){
                min =arr[i];
            }
    }
        for (int i = min; i <=max ; i++) {
            System.out.print(i+ " ");


        }
        return -1;
    }
}
