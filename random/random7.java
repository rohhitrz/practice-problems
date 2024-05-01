package random;

import java.util.Arrays;
import java.util.Locale;

public class random7 {

    public static  int x =10;

    public static void main(String[] args) {


        String s1 = "java programming";
        String s2 = "Java";

         String [] words = s1.split("a");

        System.out.println(Arrays.toString(words));
        System.out.println(words.length);


        System.out.println(s2.contains(null));



    }
}
