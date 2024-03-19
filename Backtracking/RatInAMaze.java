package Backtracking;

public class RatInAMaze {

    public static void main(String[] args) {

        int mat [][] = {{1,1,1,0},
                        {1,0,0,1},
                        {1,1,0,0},
                        {1,1,1,1},};

        int mat2[][] ={ {0 ,1 ,1},
                {1 ,1 ,1},
                {1 ,1 ,1},};


        int row = mat2.length;
        int col = mat2[0].length;

        boolean vis [][] = new boolean[row][col];
        vis[0][0]= true;

        ratInAMaze(mat2,vis,0,0,row,col,"");
}

   static boolean isValid(int i, int j, int mat[][], boolean vis [][], int row, int col){

        if(i < row && i>=0 && j<col && j>=0 && mat[i][j]== 1 && vis[i][j]==false){
            return true;

        }

    return  false;
   }

    //Directions - DLRU
    static void ratInAMaze(int mat[][], boolean vis[][], int i, int j, int row, int col, String path){

        if(i == row-1 && j== col-1){ //bottom right corner reached
            System.out.println(path);
            return;
        }

        if(mat[0][0]==0){
            return;
        }
        if(isValid(i+1,j, mat, vis,row,col)){  //Down
            vis[i+1][j]=true;
            ratInAMaze(mat,vis,i+1,j,row,col,path+'D');
            vis[i+1][j]=false;
}
        if(isValid(i,j-1, mat, vis,row,col)){  //left
            vis[i][j-1]=true;

            ratInAMaze(mat,vis,i,j-1,row,col,path+'L');
            vis[i][j-1]=false;



        } if(isValid(i,j+1, mat, vis,row,col)){  //right
            vis[i][j+1]=true;

            ratInAMaze(mat,vis,i,j+1,row,col,path+'R');

            vis[i][j+1]=false;


        }if(isValid(i-1,j, mat, vis,row,col)){  //up
            vis[i-1][j]=true;
            ratInAMaze(mat,vis,i-1,j,row,col,path+'U');
            vis[i-1][j]=false;


        }





    }



}
