public class sum_of_n_naturals {


    public static int sumofn(int n){

        if(n==1){
            return 1;
        }

       int small_sum= sumofn(n-1);
       int total=small_sum+n;

       return total;
    }

    public static void main(String[] args) {
        int n=10;
       System.out.println(sumofn(n));
    }
    
}
