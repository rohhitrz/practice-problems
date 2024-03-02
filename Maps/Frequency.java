package Maps;

import java.util.HashMap;

/*
* Sample Input 1 :
13
2 12 2 11 12 2 1 2 2 11 12 2 6
Sample Output 1 :
2
Sample Input 2 :
6
7 2 2 4 8 4
Sample Output 2 :
2
Explanation:
Here, both element '2' and element '4' have same frequency but '2'
* occur first in orignal array that's why we are returning '2' as output.
* */
public class Frequency {

    static int frequency(int arr[]) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        //1. key->arr[i]
        //2. value->frequency

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        int maxFrequency = 0;
        int maxKey = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) > maxFrequency) {
                maxFrequency = hm.get(arr[i]);
                maxKey = arr[i];
            }
        }
        return maxKey;


    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 56, 10};
        int res = frequency(arr);
        System.out.println(res);
    }

}
