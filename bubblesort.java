public class bubblesort {

    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
    
                }
            }
        }
    }
    
    public static void printbubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" "); 
        }
        
    }

    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){

            int minpos=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }

            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

        }


    }
    public static void printselectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" "); 
        }
        System.out.println();
    }

    // public static void insertionsort(int arr[]){

    //     for (int i = 1; i < arr.length; i++) {
    //         int curr = i;              // index of current element
    //         int prev = i - 1;          // index of the element before it
    //         int currVal = arr[curr];   // value we want to insert
        
    //         while (prev >= 0 && arr[prev] > currVal) {
    //             arr[prev + 1] = arr[prev];  // shift element to right
    //             prev--;                     // move to the previous index
    //         }
        
    //         arr[prev + 1] = currVal;        // insert currVal in right position
    //     }
        
    // }
    
    
public static void insertion_sort(int arr[]){

    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

            }else break;
        }
    }

} 
public static void print_insertionsort(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" "); 
    }
    System.out.println();
    }
  
    

    public static void main(String[] args) {
        int original[] = {5, 4, 1, 3, 2};
    
        int bubble[] = original.clone();
        bubblesort(bubble);
        System.out.print("Bubble Sort: ");
        printbubblesort(bubble);
    
        int selection[] = original.clone();
        selectionsort(selection);
        System.out.print("Selection Sort: ");
        printselectionsort(selection);
    
        int insertion[] = original.clone();
        insertion_sort(insertion);
        System.out.print("Insertion Sort: ");
        print_insertionsort(insertion);
    }
    