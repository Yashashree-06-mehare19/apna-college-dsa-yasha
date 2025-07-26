import java.util.Scanner;

public class Sum_of_n_natural_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n :");
        int n = sc.nextInt();

       // int count=0; 
       int sum=0;

        for(int i=1;i<=n;i++){

        sum=sum+i;
sc.close();
  }
        
  System.out.println(sum);
    }
    
}
