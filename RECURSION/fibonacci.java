public class fibonacci {

public static int fib(int n){

    // if(n==0) return 0;
    // else if(n==1) return 1;

    if(n==0||n==1){
        return n;
    }


    int fibnm1=fib(n-1);
    int fibnm2=fib(n-2);
    int fibn=fibnm1+fibnm2;
    return fibn;
}



    public static void main(String[] args) {
        int n=12;
      System.out.println(fib(n));
    }
    
}
