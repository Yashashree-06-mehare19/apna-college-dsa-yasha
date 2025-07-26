public class friendspairing {


    public static int friends_pairing(int n){
        if(n==1 || n==2){
            return n;
        }

        //choice - single

        int fnm1=friends_pairing(n-1);

        //choice - pair

        int fnm2=friends_pairing(n-2);

        int pairways =(n-1)*fnm2;

        //totalways

        int totways=fnm1+pairways;
        return totways;
    
    
    }

     public static void main(String[] args) {
        System.out.println(friends_pairing(3));
     }
    
}
