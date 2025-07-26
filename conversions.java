public class conversions {

public static void dectobin(int n){
    int mynum=n;
    int pow=0;
    int binnum=0;

    while(n>0){
        int rem=n%2;
        binnum=binnum+(rem*(int)Math.pow(10., pow));
        pow++;
        n=n/2;
    }
    System.out.println("binary form of"+mynum+"="+binnum);
}





public static void bintodec(int binnum){

   int pow=0;
   int decnum=0;
   
   while(binnum>0){
    int lastdigit=binnum%10;
    decnum=decnum+(lastdigit*(int)Math.pow(2, pow));
    pow++;
    binnum=binnum/10;
   }
   System.out.println("Decimal equivalent of binary number is: "+decnum);
}

    public static void main(String[] args) {

        bintodec(101);
        dectobin(9);
    }
    
}
