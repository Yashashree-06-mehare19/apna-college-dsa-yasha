public class longest_subarray_with_sum_k {
    public static int longestSubarray(int arr[],int k){

        int result=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    int sublength=j-i+1;
                    result=Math.max(sublength,result);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
           int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
    
}
