public class prime_2 {

public static boolean prime(int n){
if (n==2){
    return true;
}
   boolean  prime=true;
  // for(int i=2;i<=n-1;i++)
  for(int i=2;i<=Math.sqrt(n);i++){
    if(n%i==0){
        prime=false;

        break;
    }
   }

   return prime;
}


    public static void main(String[] args) {
        

      
        System.out.println(prime(2));
    }
    
}
