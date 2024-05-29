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
}
