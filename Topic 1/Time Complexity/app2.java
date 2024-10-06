public class app2 {
    public static int func2(int n) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Sum is : " + i + " , " + j);
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        System.out.println("Time Complexity");
        int func2 = func2(5);
        System.out.println(func2);
        // Time Complexity of Given Code is O(N*N)...
    }
}
