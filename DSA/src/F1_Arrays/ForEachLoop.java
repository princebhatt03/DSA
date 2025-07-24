package F1_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        System.out.println("For Each Loop in Java");
        /*
        For each is a special type of For loop which is used to traverse each element of Array in more simple
        way
         */
        int[] arr1 = {1,2,4,5,7};
        for (int element: arr1){
            System.out.println(element);
        }
    }
}
