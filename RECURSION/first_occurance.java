public class first_occurance {

    public static int firstoccurance(int arr[],int key,int i){
        
        if(arr[i]==arr.length){
            return -1;
        }
        
        if(key==arr[i]){
            return i;
        }

        return firstoccurance(arr, key, i+1);
    }


    public static void main(String args[]){
        int arr[]={2,4,5,6,7,81,2,4,5,7,5};
        int key=7;
        System.out.println(firstoccurance(arr, key, 0));

    }
    
}
