package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    static ArrayList<Integer> remove(int arr[]){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(seen.containsKey(arr[i])){
                continue;
            }
            else{
                output.add(arr[i]);
                seen.put(arr[i], true);

            }
        }

        return  output;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,20,30,40,50,60};

        ArrayList<Integer> res = remove(arr);
        for(int i=0; i<res.size();i++){
            System.out.println(res.get(i));
        }


    }
}
