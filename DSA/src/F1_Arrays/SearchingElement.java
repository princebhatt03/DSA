package F1_Arrays;

public class SearchingElement {
    public static void main(String[] args){
        System.out.println("Searching Element from an Array");
        int[] arr = {1,2,4,5,6,7};
        int num = 7;
        boolean found = false;
        int i;
        for (i = 0; i<arr.length;i++){
            if (num==arr[i]){
                found=true;
                break;
            }
        }
        System.out.println(found ? "Found at index " + i : "Not Found");
    }
}
