package Maps;

import java.util.HashMap;

public class ArrayIntersection {
    static void printIntersection(int arr1[], int arr2 []){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i< arr1.length;i++){
            if(hm.containsKey(arr1[i])){
                hm.put(arr1[i], hm.get(arr1[i])+1);
            }
            else{
                hm.put(arr1[i],1);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if(hm.containsKey(arr2[i])){
                int freq = hm.get(arr2[i]);
                if(freq > 0){
                    System.out.print(arr2[i]+ " ");
                    hm.put(arr2[i], freq-1);

                }
            }

        }


    }

    public static void main(String[] args) {
        int arr1[] = {1,3,2,2,3,6,2,5};
        int arr2[] = {2,4,2,3,5,6,6};

        printIntersection(arr1,arr2);

    }


}
