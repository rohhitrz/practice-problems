package Maps;

import java.util.HashMap;
import java.util.Set;

public class MapUse {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Rohit");
        map.put(2, "Alpha");
        map.put(3, "Beta");
        System.out.println(map);
        String name = map.get(1);
        System.out.println(name);

        String name2 = map.get(2);
        System.out.println(name2);

        map.remove(3);
        String name3 = map.get(3);
        System.out.println(name3);

        if(map.containsKey(1)){
            System.out.println("Has 1");
        }

        if(map.containsKey(4)){
            System.out.println("contains 4");
        }

        Set<Integer> keys = map.keySet();

        for(int key : keys){
            System.out.println(key);
        }



    }
}
