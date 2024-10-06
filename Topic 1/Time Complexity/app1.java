public class app1 {
    public static int func1(int array[], int lenght) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < lenght; i++) {
            sum += array[i];
            System.out.println(sum);
        }
        for (int i = 0; i < lenght; i++) {
            product *= array[i];
            System.out.println(product);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Time Complexity");
        // Time Complexity is the study of efficiency of algorithms...
        // Time Complexity of given Code is O(N)...
        int arr[] = { 3, 5, 66 };
        int func1 = func1(arr, 3);
        System.out.println(func1);
    }
}