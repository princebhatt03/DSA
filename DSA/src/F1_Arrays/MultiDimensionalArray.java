package F1_Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args){
        System.out.println("Multidimensional Arrays");
        /*
        Multidimensional Arrays are Array of Array
        We can Create 2D, 3D upto any dimension for a given Array...
         */
//        1. 2-D Arrays:
        int[][] arr1 = new int[2][3];
        arr1[0][0] = 12;
        arr1[0][1] = 14;
        arr1[0][2] = 16;
        arr1[1][0] = 18;
        arr1[1][1] = 20;
        arr1[1][2] = 22;
//        This is how we can Create a 2-D Array...
//        For Traversing a 2-D Array we can use for Loop as:
        for (int i=0; i<arr1.length;i++){
            for(int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }
        }
    }
}
