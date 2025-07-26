import java.util.Scanner;

public class spiral_matrix {
    

public static void print_spiral_matrix(int matrix[][]){

int start_row=0;
int end_row= matrix.length-1;
int start_col=0;
int end_col=matrix[0].length-1;


while(start_row<=end_row && start_col<=end_col){

//j=col  i==row


//top 
for(int j=start_col;j<=end_col;j++){
    System.out.print(matrix[start_row][j]+" ");
}

//right
for(int i=start_row+1;i<=end_row;i++){
    System.out.print(matrix[i][end_col]+ " ");    
}

//bottom
if(start_row<end_row){
for(int j=end_col-1;j>=start_col;j--){
    System.out.print(matrix[end_row][j]+" ");
}
}
//left
if(start_col<end_col){
for(int i=end_row-1;i>=start_row+1;i--){
    System.out.print(matrix[i][start_col]+" ");
}
}

start_col++;
start_row++;
end_col--;
end_row--;



}


}




public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
//taking input number of rows and cols
System.out.println("enter number of rows:");
int n=sc.nextInt();
System.out.println("enter number of columns :");
int m=sc.nextInt();

int matrix[][]=new int[n][m];//declred a 2d array
//taking input 
System.out.println("enter "+n*m+"number of elements: ");
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
         matrix[i][j]=sc.nextInt();
    }
}
//output array 
System.out.println("matrix is :");
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
         System.out.print(matrix[i][j]+" ");
    }
    System.out.println();


}

print_spiral_matrix(matrix);
sc.close();

}

}


    

