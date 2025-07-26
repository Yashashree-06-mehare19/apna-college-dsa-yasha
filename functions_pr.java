import java.util.Scanner;

public class functions_pr {

public static int average(int a,int b, int c){

int avg=(a+b+c)/3;

return avg;
}

public static boolean isEven(int n){
    if(n%2==0){
        return true;
    }
    else return false;
}



public static void palindrome(int n){

int palindrome=n;

int rev=0;

while(palindrome!=0){

    int rem=palindrome%10;

    rev=rev*10+rem;
    palindrome=palindrome/10;
}
if(n==rev){
    System.out.println("palindrome");
}else System.out.println("not a palindrome");

}



public static int sum_of_dig(int n){
int sum=0;

while(n!=0){

    int ld=n%10;
    sum=sum+ld;
    n=n/10;

}
return sum;

}


    public static void main(String[] args) {
       
       // System.out.println(average(2,4,7));

       System.out.println(isEven(4));


       System.out.println("enter the number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palindrome(n);
sc.close();

sum_of_dig(n);
System.out.println(sum_of_dig(n));
    }
   

}