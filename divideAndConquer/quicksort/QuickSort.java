package divideAndConquer.quicksort;

public class QuickSort {
    public static void quickSort(int[] arr, int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return;
        }

        int pivotIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivotIndex - 1); // For sorting of elements on the left side of the pivot
        quickSort(arr, pivotIndex + 1, endIndex); // For sorting of elements on the right side of the pivot
    }

    public static int partition(int[] arr, int startIndex, int endIndex){
        int i = -1; // It will be used to swap elements that are smaller than the pivot with larger elements
        int pivot = arr[endIndex];

        for(int j = startIndex; j < endIndex; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[endIndex] = arr[i];
        arr[i] = temp;

        return i; // It will return the index  of the pivot
    }

    public static void print(int[] arr){
        for(int index = 0; index < arr.length; index++){
            System.out.println(arr[index] + " ");
        }
        System.out.println();
    }
}
