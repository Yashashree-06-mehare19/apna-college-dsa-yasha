import java.util.Scanner;

public class ARRAYASS1 {



    public static boolean iftwice(int n[]){

        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){

                if(n[i]==n[j]){

                    return true;
                }
            }
        }
        return false;
    }


public static int findtarget(int nums[],int target){

int start=0;
int end=nums.length-1;
while(start<=end){
int mid=(start+end)/2;

//case 1 if target ==mid

if(nums[mid]==target){
    return mid;
}
//1.check if left half is sorted 
//2.check does target lie in left hald
//3.else go in right half
else if(nums[start]<=nums[mid]){
    if(nums[start]<=target && target< nums[mid]){
 
        end=mid-1;

    }
    else start=mid+1;
}
//now same for right half
else if(nums[mid]<=nums[end]){
        if(nums[mid]<target && target <=nums[end]){
            start=mid+1;

        }
        else end=mid-1;
}

}
return -1;
}

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int []n=new int[size];

        System.out.println("enter the "+ size+" elements in the array: ");
        for (int i=0;i<size;i++){
        n[i]=sc.nextInt();
        
    }
       System.out.println(iftwice(n)) ;

      sc.close();


int nums[]={4,5,6,7,0,1,2};
int target=2;

System.out.println("so the index at which the target is "+findtarget(nums, target));

  }
  
}
    
               
