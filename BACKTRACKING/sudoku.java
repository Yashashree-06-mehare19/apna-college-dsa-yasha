public class sudoku {

public static boolean isSafe(int Sudoku[][], int row, int col, int digit){

    //col

    for(int i=0;i<=8;i++){
        if(Sudoku[i][col]==digit){
            return false;
        }
    }

    for(int j=0;j<=8;j++){
        if(Sudoku[row][j]==digit){
            return false;
        }
    }

    //grid

   int sr=(row/3)*3;
   int sc=(col/3)*3;
    for(int i=sr;i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
            if(Sudoku[i][j]==digit){
                return false;
            }
        }
    }

return true;
}


    public static boolean sudokusolver(int Sudoku[][],int row, int col){

        //base case

        if(row==9 && col==0){
            return true;
        }

        //recurssion

        int nextrow=row, nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;

        }

        if(Sudoku[row][col]!=0){//we dont wanna put elemnt where elemnt is already given , so if the elem is not 0 then next elem pls
           return  sudokusolver(Sudoku, nextrow, nextcol);
        }


        for(int digit=1;digit<=9;digit++){
            if(isSafe(Sudoku ,row, col, digit)){
                Sudoku[row][col]=digit;
            
            if(sudokusolver(Sudoku, nextrow, nextcol)){//soln exists

                return true;
            }
            Sudoku[row][col]=0;
        }
    }
   return false;
}  


 public static void printsudoku(int Sudoku[][]){
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(Sudoku[i][j]+" ");
       }
       System.out.println();
    }
    
 } 


    
    public static void main(String[] args) {
        
        int[][] Sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

   if (sudokusolver(Sudoku, 0, 0)){
     System.out.println("solution exists");
     printsudoku(Sudoku);
   }
else{
    System.out.println("solution doesnot exist");
}

    }}
