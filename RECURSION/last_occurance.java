public class last_occurance {


    public static int lastoccurance(int arr[],int i, int key){

         if(i==arr.length) return -1;

         int isfound=lastoccurance(arr, i+1, key);
         if(isfound!=-1){
            return isfound;
         }
       //check with self

       if(arr[i]==key){
        return i;
       }

       return isfound;
    }

    public static void main(String args[]){
         int arr[]={2,4,5,6,7,81,2,4,5,7,5};
        int key=7;
        System.out.println(lastoccurance(arr,0,key));
    }
    
}
