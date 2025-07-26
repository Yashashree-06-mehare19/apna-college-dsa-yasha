import java.util.*;

public class Sorting_descending {

public static void bubble_desc_sort(int arr[]){

    for(int i=0;i<=arr.length-1;i++){
        for(int j=1;j<arr.length-i;j++){
            if(arr[j]>arr[j-1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

            }
        }
    }

}

public static void print(int arr[]){

    for(int i=0;i<=arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}


 public static void main(String[] args) {
      
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubble_desc_sort(arr);
        print(arr);
    }
    
}
