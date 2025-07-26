import java.util.Scanner;

public class num_halfpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of rows :(n):");
        int n=sc.nextInt();

        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);

            }
            System.out.println();
       
        }
        
        System.out.println("again give lines for inverted half pyramid :");
        int line=sc.nextInt();

        for(int i=1;i<=line;i++){
            for(int j=1;j<=line-i+1;j++){

                System.out.print(j);
            }

            System.out.println();
        }
sc.close();
    }
    
}
