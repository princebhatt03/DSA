package F1_Arrays;

import java.util.Scanner;

public class InsertionInMultidimensionalArray {
    public static void main(String[] args){
        System.out.println("Insertion in Multidimensional Array");
        Scanner sc = new Scanner(System.in);
//        For 2-D Array...
        int [][] arr1 = new int[2][3];
        for (int i = 0; i<arr1.length;i++){
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.println("Enter the Element for index " + i + ", " + j + ": ");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Array Elements are: ");
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }
        }

//        For 3-D Array...
        int[][][] arr2 = new int[2][2][3];
        for (int i = 0; i<arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++) {
                for(int k = 0; k < arr2[j].length; k++) {
                    System.out.println("Enter the Element for index " + i + ", " + j + ", " + k + ": ");
                    arr2[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("The Array Elements are: ");
        for (int i =0; i<arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++) {
                for(int k = 0; k < arr2[j].length; k++) {
                    System.out.println(arr2[i][j][k]);
                }
            }
        }
    }
}
