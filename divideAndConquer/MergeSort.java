package divideAndConquer;

public class MergeSort{
    public static void mergeSort(int[] arr, int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        // Sorting left part of the array
        mergeSort(arr, startIndex, middle);

        // Sorting right part of the array
        mergeSort(arr, middle + 1, endIndex);

        // merging both parts of the array
        merge(arr, startIndex, middle, endIndex);
    }

    public static void merge(int[] arr, int stIndex, int mid, int enIndex){
        int[] tempArr = new int[enIndex - stIndex + 1];
        int i = stIndex; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temporary array

        while(i <= mid && j <= enIndex){
            if(arr[i] < arr[j]){
                tempArr[k] = arr[i];
                i++;
            } else {
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }

        // If elements are left in left part
        while(i <= mid){
            tempArr[k++] = arr[i++];
        }

        // If elements are left in right part
        while(j <= enIndex){
            tempArr[k++] = arr[j++];
        }

        for(k = 0, i = stIndex; k < tempArr.length; k++, i++){
                arr[i] = tempArr[k];
        }
    }

    public static void print(int[] arr){
        for(int index = 0; index < arr.length; index++){
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
}