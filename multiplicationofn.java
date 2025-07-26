import java.util.Scanner;

public class multiplicationofn {

public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     

     System.out.println("enter a number :");
     int n=sc.nextInt();
    int mul=1;
     for(int i=1;i<=10;i++){
        mul=n*i;

        System.out.println(n+"*"+i +"="+mul);
     }

     sc.close();
}
    
}
