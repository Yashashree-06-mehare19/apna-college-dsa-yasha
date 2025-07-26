import java.util.Scanner;

public class palindrome {

public static int ispalindrome(int n){
 
    int palindrome=n;
    int rev=0;

    while(palindrome !=0){

        int rem=palindrome%10;

        rev=rev*10+rem;

        palindrome=palindrome/10;


    }
    System.out.println("the reverse of the number n is "+ rev);
     return rev;
}



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number : ");
        int n = sc.nextInt();

     //   ispalindrome(n);
        int reversed=ispalindrome(n);
        if(reversed==n){
            System.out.println("the given number "+ n+" is palindrome:");
        }
        else{
            System.out.println("not a plaindrome");
        }

        sc.close();
    }
    
}
