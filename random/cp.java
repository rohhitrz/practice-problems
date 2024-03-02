package random;

import javax.crypto.spec.PSource;
import java.util.HashMap;

public class cp {
    static int countPairs(int input[], int size){
        if(size ==0){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key: input){
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }

        int countPairs =0;
        for(Integer i: map.keySet()){
            if(map.containsKey(-i) && i != 0){
                countPairs+=  map.get(i) * map.get(-i);
      }

        }

        countPairs /=2;
        if(map.containsKey(0)){
            int val = map.get(0);
            countPairs += val* (val-1)/2;
        }

        return  countPairs;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4,-1,-2,2};
        int res = countPairs(arr,arr.length);
        System.out.println(res);


    }
}
