import java.util.Scanner;

public class functioncallbasics {
// public static void hello(){

//     System.out.println("hello world ");
//     System.out.println("hello world ");
//     System.out.println("hello world ");
//     System.out.println("hello world ");
// }

public static int Sum(int a, int b){
int sum=a+b;
System.out.println("the sum is "+ sum);
return sum;
}

public static int multiply(int a,int b){

    int product=a*b;

    return product;
}


public static int factorial(int n){
    int fact =1;
    for(int i=1;i<=n;i++){
        fact=fact*i;

    }

   
    return fact;



}

public static int bincoefficient(int n, int r){
    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_nmr=factorial(n-r);

    int bincoeff= fact_n/((fact_r)*fact_nmr);
    return bincoeff;
}

public static int sum(int a,int b){
    return a+b;
}
public static int sum(int a,int b, int c){
    return a+b+c;//SAME NAME + DIFF PARAMETERS
}

public static float sum(float a,float b){
    return a+b;
}

public static float sum(int a ,int b, int c,int d){
    return a+b+c+d;//SAME NAME + DIFF PARAMETERS+DIFF RETURN TYPE ALLOWED 
}
// public static float sum(int a ,int b, int c,int d){
//     return a+b+c+d;  NOT ALLOWED >>SAME NAME +DIFF RETURNTYPE NOT ALLOWED 


    public static void main(String[] args) {
        System.out.println("now i will call the function ");

       // hello();
       Scanner sc=new Scanner(System.in);

       int num1=sc.nextInt();
      int num2=sc.nextInt();
       Sum(num1,num2); 
int prod=multiply(3,7);
System.out.println("a*b ="+ prod);

factorial(7);
System.out.println(factorial(7));
System.out.println(bincoefficient(5,2));
sc.close();
    }
    

}
