public class binarystrings {

    public static void printbinarystrings(int n ,int lastplace,String str){


        //basecase

        if(n==0){
            System.out.println(str);
            return;
        }

        //kaam

        if(lastplace==0){
            //sit 0 on chair n 
            printbinarystrings(n-1, 0, str+"0");
            printbinarystrings(n-1, 1, str+"1");

        } else{
            printbinarystrings(n-1, 0, str+"0");

        }
    }
    public static void main(String[] args) {
        printbinarystrings(3, 0,  " ");
    }
    
}
