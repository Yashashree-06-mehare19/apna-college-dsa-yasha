import java.util.*;

public class SortAlgorithms {

    // Bubble Sort
    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            // Swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertion_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    // Counting Sort
    public static void counting_sort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        //count frequency of each number 
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting :Reconstruct the original array in sorted order
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Print array
    public static void printArray(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        int original[] = {5, 4, 1, 3, 2,2,3,7,5,3};

        int bubble[] = original.clone();
        bubblesort(bubble);
        System.out.print("Bubble Sort: ");
        printArray(bubble);

        int selection[] = original.clone();
        selectionsort(selection);
        System.out.print("Selection Sort: ");
        printArray(selection);

        int insertion[] = original.clone();
        insertion_sort(insertion);
        System.out.print("Insertion Sort: ");
        printArray(insertion);

        int countsort[] = original.clone();
        counting_sort(countsort);
        System.out.print("Counting Sort: ");
        printArray(countsort);
    }
}
