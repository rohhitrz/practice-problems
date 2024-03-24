package Backtracking;

public class knightsTourProblem {

    public static void main(String[] args) {
        int n=5;
        int arr[][] = knightsTour(n);
        for(int i=0;i<n;i++){
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }

    static int[][] knightsTour(int n){
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j <n ; j++) {
                arr[i][j] = -1;
            }
        }

        arr[0][0]=0;
//        int movesX [] ={-2,-2,-1,};
//        int movesY [] ={-1,-2,-1,};

        int movesX [] = {2,1,-1,-2,-2,-1,1,2};
        int movesY [] = {1,2,2,1,-1,-2,-2,-1};

        KnightsTourHelper(n,arr, movesX,movesY,0,0,1);
        return arr;



    }


    static boolean KnightsTourHelper(int n, int [][] arr, int movesX[], int movesY[], int currX, int currY, int step){
        if(step == n*n){
            return true;
        }

        for(int i=0;i<8;i++){
            int nextX = currX+ movesX[i];
            int nextY = currY+ movesY[i];
            if(isValid(n,arr,nextX,nextY)){
                arr[nextX][nextY] = step;
                boolean isTourCompleted = KnightsTourHelper(n,arr,movesX,movesY,nextX,nextY,step+1);
                if(isTourCompleted){
                    return true;
                }
                else{
                    arr[nextX][nextY]=-1;
                }
            }
        }
        return false;

    }

    static boolean isValid(int n,int arr[][], int x, int y){
        return (x>=0 && x<n && y>=0 && y<n && arr[x][y]==-1);
    }
}
