package divideAndConquer.quicksort;

public class Main {
    public static void main(String[] args){
       int[] arr = {6, 3, 9, 8, 2, 5};
       QuickSort.quickSort(arr, 0, arr.length - 1);
       QuickSort.print(arr);
    }
}
