import java.util.Scanner;

public class skip_on_multilple {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
               
            } 
        else 
        System.out.println(" number is  "+n);
     sc.close();
     }while(true);
    
}
}
