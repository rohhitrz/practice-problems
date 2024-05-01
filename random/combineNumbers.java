package random;

public class combineNumbers {

    static int combinedNumbers(int arr[]){
        StringBuilder sb = new StringBuilder();
        for(int num: arr){
            sb.append(num);
        }
        return  Integer.parseInt(sb.toString()) +1 ;
    }

    public static void main(String[] args) {
        int arr [] ={1,2,3,9};
        System.out.println(combinedNumbers(arr));
    }

}
