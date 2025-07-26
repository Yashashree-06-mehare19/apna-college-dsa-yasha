//import java.util.*;
public class Array_reverse {
    


    public static void reverse(int numbers[]){
       
        int first=0; int last=numbers.length-1;

        while(first<last){

            //swap

           int temp=numbers[last];
           numbers[last]=numbers[first];
           numbers[first]=temp;
        
           first++;
           last--;
        }
        }

        public static void printsubarrays(int numbers[]){

          int ts =0;

          for(int i=0;i<numbers.length;i++){
          int start=i;
            
            for(int j=i;j<numbers.length;j++){
            int end=j;
              
              for(int k=start;k<=end;k++){

                System.out.print(numbers[k]+" ");
 
              }

              ts++;
              System.out.println();
            }
            System.out.println();
          }
          System.out.println("total subarrays= "+ts);

        }




        

        public static void printpairs(int numbers[]){

          for(int i=0;i<numbers.length;i++){

            int curr=numbers[i];

            for(int j=i+1;j<numbers.length;j++){

                System.out.print("("+ curr+","+numbers[j]+")");
            }

            System.out.println();
          }   


        }


        public static int max_subarray_brute(int numbers[]){

          int max_sum=Integer.MIN_VALUE; int curr_sum=0;
          
          for(int i=0;i<numbers.length;i++){
            int start=i;
            
            for(int j=i;j<numbers.length;j++){
              int end=j; curr_sum=0;
              for(int k=start;k<=end;k++){

                curr_sum+=numbers[k];
               
              }
              System.out.println("curent sum"+curr_sum);
               
              if(curr_sum>max_sum){
                max_sum=curr_sum;
              }
             
              
            }
            
          }
          System.out.println("max sum of the subarrays of the given arrays is "+max_sum);
          
return max_sum;

        }

        public static void max_subarray_prefix(int numbers[]){

          int curr_sum=0;
          int max_sum=Integer.MIN_VALUE;
          int prefix[]=new int[numbers.length];

          prefix[0]=numbers[0];

          //calculate prefix arrays
          for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
          }

          for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
              int end=j;
              
              curr_sum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];

              if(max_sum<curr_sum){
                max_sum=curr_sum; 
              }
            }
          }
         System.out.println("max sum of subarrys (prefix sum )="+ max_sum);        
        }


        public static void max_sub_array_kadanes(int numbers[]){

          int  cs=0;
          int  ms= Integer.MIN_VALUE;

          for(int i=0;i<numbers.length;i++){


            cs=cs+numbers[i];
            if(cs<0){
              cs=0;
            }
            ms=Math.max(ms,cs);

          }



          System.out.println("The max sum of the subarrays (kadanes):"+ms);

        }

        public static void max_sub_array_kadanes_2(int numbers[]) {
          int cs = numbers[0];  // Start from first element
          int ms = numbers[0];  // Max sum starts from first
      
          for (int i = 1; i < numbers.length; i++) {
              cs = Math.max(numbers[i], cs + numbers[i]); // Continue or restart
              ms = Math.max(ms, cs); // Track max sum
          }
      
          System.out.println("Max subarray sum: better kadens(with all-ves also works ) " + ms);
      }



      public static void main(String[] args) {
  
//int height[]={4,2,0,6,3,2,5};  
int numbers[]={-2,-3,4,-1,-2,1,5,-3};

reverse(numbers);

for(int i=0;i<numbers.length;i++){

    System.out.print(numbers[i]+" ");
}

System.out.println();

printpairs(numbers);

printsubarrays(numbers);

max_subarray_brute(numbers);

max_subarray_prefix(numbers);

max_sub_array_kadanes(numbers);

max_sub_array_kadanes_2(numbers);


}

}