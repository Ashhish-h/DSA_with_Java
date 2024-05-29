package divideAndConquer.mergesort;

public class Main {
    public static void main(String[] args){
        int[] arr = {6, 3, 8, 1, 11, 0};
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        MergeSort.print(arr);
    }
}
