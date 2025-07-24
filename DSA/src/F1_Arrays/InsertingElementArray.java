package F1_Arrays;

import java.util.Scanner;

public class InsertingElementArray {
    public static void main(String[] args){
        System.out.println("Inserting Elements in Array using user Inputs");
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        for(int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the Element for index " + i + ": ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
