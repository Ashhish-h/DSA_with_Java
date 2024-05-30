package backtracking;


// This class is an basic example of how to do backtracking on arrays.
// In this example we are modifying an empty array and add elements in it and then modify the elements in the array through backtracking 
public class BackTrackingOnArray {
    public static void modifyArray(int[] array, int index, int val){
        // Base Condition
        if(index == array.length){
            System.out.println("Array before performing backtracking");
            printArray(array); // Print the modifed array 
            return;
        }


        array[index] = val;
        modifyArray(array, index + 1, val + 1); //recursive function 
        array[index] = array[index] - 2; // Modifying the array by backtracking
    }

    public static void printArray(int[] array){
        for(int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }


    //main method
    public static void main(String[] args){
        int[] array = new int[5];
        BackTrackingOnArray.modifyArray(array, 0, 1); 
        BackTrackingOnArray.printArray(array);
    }
}
