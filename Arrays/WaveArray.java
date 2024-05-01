package Arrays;

import java.util.*;

public class WaveArray {


    static void swap(ArrayList<Integer> A,int i, int j ){

        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
 }


    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        //You Can Code Here

        Collections.sort(A);


        for(int i=1;i<A.size();i+=2){

            int temp = A.get(i);
            swap(A,i,i-1);

        }


        return A;

    }



}
