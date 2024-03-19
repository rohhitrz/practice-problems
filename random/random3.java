package random;
import java.util.*;
public class random3 {


        public static void firstMissingPositive(int[] nums) {
            int res [] = new int [nums.length];
            for(int i=0;i<nums.length;i++){
                if(nums[i] > 0){
                    res[i]=nums[i];

                }
            }
            System.out.println(Arrays.toString(res));
        }

        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            int n = in.nextInt();
//            int[] nums = new int[n];
//            for(int i = 0 ; i < n ; ++i) {
//                nums[i] = in.nextInt();
//            }
//            int result = new FirstMissingPositive().firstMissingPositive(nums);
//            System.out.println(result);

            int [] arr ={1,2,3,-1};
          firstMissingPositive(arr);

        }
    }


