package F1_Arrays;

public class DeletingElementArray {
    public static void main(String[] args){
        System.out.println("Deleting an Element from Array");
        int[] arr = {1,2,3,45,5,56};
        int valueToDelete = 3;
        int n = arr.length;
        int i;
        for (i=0;i<n;i++){
            if (arr[i] == valueToDelete){
                break;
            }
        }
        if (i<n){
            for(int j = i; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            n--;
        }
        System.out.println("After Deleting the new Array is: ");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
