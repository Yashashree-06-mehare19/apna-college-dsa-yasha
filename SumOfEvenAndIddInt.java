import java.util.Scanner;

public class SumOfEvenAndIddInt {
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       int n;
       int choice;
       int evensum=0;
       int oddsum=0;

       do{
       System.out.println("enter the numbers :");

         n=sc.nextInt();
        if(n%2==0){
            evensum+=n;

        }
        else{
            oddsum+=n;

        }
        System.out.println("do u wana continue? press 1 for yes and 0 for no ");

        choice=sc.nextInt();

       }
       while(choice==1);

       System.out.println("sum of even numbrs is "+ evensum);
        System.out.println("sum of odd numbers "+oddsum);

       sc.close();
    }
    
}
