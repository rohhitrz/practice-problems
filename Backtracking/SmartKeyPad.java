package Backtracking;
import  java.util.*;
public class SmartKeyPad {

    public static void main(String[] args) {

        String input ="23";
        System.out.println(lettercombination(input));

    }

    static ArrayList<String>  lettercombination(String input){

        String map [] ={
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        ArrayList<String> ans = new ArrayList<>();
        String curr="";
        smartKeypadHelper(input,map,0,ans,curr);
        return ans;

    }


    static void smartKeypadHelper(String input, String map[], int index, ArrayList<String> ans,String curr){

        if(index == input.length()){
            ans.add(curr);
            return;
}

        int keypadNumber = input.charAt(index) - '0';
        String keyPadString = map[keypadNumber];

        for(int i =0;i<keyPadString.length();i++){
            smartKeypadHelper(input,map,index+1,ans, curr+keyPadString.charAt(i));
        }




    }
}
