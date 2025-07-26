

public class Print_dec_numbers {

public static void printdecreasing(int n){

if(n==1){
    System.out.print(n);
    return;
}



    System.out.print(n+" ");
    printdecreasing(n-1);
}


    public static void main(String[] args) {
        int n=10;
        printdecreasing(n);

    }
    
}
