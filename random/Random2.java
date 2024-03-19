package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Random2 {

    static PriorityQueue<Integer> sortK(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <=k ; i++) {
            pq.add(arr[i]);
        }

        int index =0;
        for (int i = k+1; i <arr.length ; i++) {
            arr[index++]= pq.poll();

        }
        return pq;


    }

    public static void main(String[] args) {
        int arr [] = {9,8,7,18,19,17};
        System.out.println(Arrays.toString(arr));
        System.out.println(sortK(arr,2));

    }
}
