package F1_Arrays;

public class IntroductionToArray {
    public static void main(String[] args) {
        System.out.println("Arrays in Java");
        /*
        # What is Array?
        An array is a collection of elements (values or variables), each identified by an index or key.
        All elements are of the same data type.
        # Characteristics:
        Fixed size (in static arrays)
        Elements stored in contiguous memory
        # Array Declaration & Initialization
        int[] arr = new int[5]; -> Declaration & memory allocation
        arr[0] = 10;
        arr[1] = 20;
        int[] arr = {10, 20, 30, 40, 50}; -> Direct initialization
         */

//      1. Type 1 of Declaration:
        int[] arr1 = new int[3];
        arr1[0] = 12;
        arr1[1] = 14;
        arr1[2] = 16;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

//      2. Type 2 of Declaration:
        int[] arr2 = {1,2,4,5};
        System.out.println(arr2[0]);
    }
}