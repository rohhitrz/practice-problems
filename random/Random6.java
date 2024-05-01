package random;

public class Random6 {

    public static void main(String[] args) {

//        int x=10;
//        myfunction();
//        System.out.println(x+ " ");

        int mat[][]= {{1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum =0;

        System.out.println(mat.length);
        for (int i = 0; i <mat.length ; i++) {
            sum+= mat[i][mat.length-i-1];

        }
        System.out.println(sum);

 }

  static  void myfunction(){
        int x=20;
      System.out.println(x+" ");
  }

    }

