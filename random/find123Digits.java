package random;
import java.util.*;


public class find123Digits {

//     static List<Integer> find123Digits(int[] arr, int n)
//    {
//        //You can code here
//
//        List<Integer> result = new ArrayList<>();
//
//        ArrayList<Integer> array = new ArrayList<>();
//
//        for(int i=0;i<arr.length;i++){
//            array.add(arr[i]);
//        }
//
//        for(int ele: array){
//            System.out.println(ele);
//        }
//
//
//
//
//
//    }


    static boolean contains123(int num){
        String str = String.valueOf(num);
        return  str.contains("1") && str.contains("2") && str.contains("3");

    }

    public static void main(String[] args) {

         int arr [] = {321, 123, 89, 32, 11};
        ArrayList<Integer> array = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            array.add(arr[i]);
        }



        for(int ele: array){
//            System.out.println(ele);
            if(contains123(ele))
            {
                System.out.println(ele);
            }


        }





    }






}
