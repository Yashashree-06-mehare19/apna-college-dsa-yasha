//import java.util.*;

public class Array_search {

public static int linear_search(int numbers[],int key){

    for(int i=0;i<numbers.length;i++){
        if(numbers[i]==key){

            return i;
        }
       
    }
    return -1;
}



public static int getlargest(int numbers[]){

   
 int largest=Integer.MIN_VALUE;//set largest value as -infinity
 int smallest=Integer.MAX_VALUE;//Set smallest value as +infinity
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]>largest){
            largest=numbers[i];

        }
    }

    for(int i=0;i<numbers.length;i++){
        if(numbers[i]<smallest){
            smallest=numbers[i];
        }
    }
    System.out.println("smallest value is "+smallest);
    return largest;
 

}


public static int binary_search(int numbers[],int key){

    int start =0;
    int end=numbers.length-1;

    while(start<=end){

        int mid=(start+end)/2;
        
        //comparisions

        if(numbers[mid]== key){
            return mid;
        }
        else if (numbers[mid]<key) {
            //right
            start=mid+1;
        }else
         end=mid-1;//left
    
    }

    return -1;
}

public static void main(String[] args) {
    
int numbers[]={1,2,4,5,6,7,8,9,13};
int key=8;

int index=linear_search(numbers, key);
if(index==-1){
    System.out.println("key not found");
}else System.out.println("key is on index :"+ index);

System.out.println("largest value is "+ getlargest(numbers));

System.out.println("index for key is "+ binary_search(numbers, key));

}
    
}
