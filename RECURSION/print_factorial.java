public class print_factorial {
public static int factorial(int n){
  

if (n==0){
return 1;
    }
int fnm1=factorial(n-1);
int fn=n*fnm1;
return fn;
}

    public static void main(String[] args) {
        int n=10;
        System.out.println(factorial(n));
    }
    
}
