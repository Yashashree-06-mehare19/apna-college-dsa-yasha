public class print_inc_numbers {



    public static void print_increasing(int n){
        
        if(n==1){

            System.out.print(n+" ");
                return;
            };

            print_increasing(n-1);
            System.out.print(n+" ");
        }
        

 


    public static void main(String[] args) {
        int n=10;
        print_increasing(n);
    }
    
}
