public class tiling_pr {

    public static int tiling(int n){//2*n tile board : n we will give 

        //base case'
        if(n==0 || n==1){

            return 1;
        }


        //kaam
        //choose verticl tiles 

        int fnm1=tiling(n-1);

        //choose horizontal tiles 

        int fnm2=tiling(n-2);

        //total tiles

        int totaltiles=fnm1+fnm2;

        return totaltiles;



    }


    public static void main(String[] args) {
        System.out.println(tiling(5));
    }
    
}
