import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int rev=0; 
       while(n>0){
        int last_digit=n%10;
        n=n/10;
        rev=(rev)*10+last_digit;

       sc.close();

       }
       System.out.println(rev);
       
        

        

    }
    
}
