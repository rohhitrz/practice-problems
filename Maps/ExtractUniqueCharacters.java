package Maps;

import java.util.HashMap;

public class ExtractUniqueCharacters {
    static String unique(String str){
        HashMap<Character, Integer> hm = new HashMap<>();

        String s ="";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);

            if(!hm.containsKey(ch)){
                s+=ch;
                hm.put(ch,1);
  }


        }
        return s;
    }

    public static void main(String[] args) {
        String str = "abcdefabcdefaa";
        System.out.println(unique(str));
    }
}
