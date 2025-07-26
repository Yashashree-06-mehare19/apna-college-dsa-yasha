import java.util.*;
public class input {

    public static boolean search(int matrix[][],int key){

    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
                return true;
            }
        }
        
    }
    System.out.println("key not found ");
return false;
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

//search(matrix, 5);
System.out.println(search(matrix, 5));
sc.close();

}

}
