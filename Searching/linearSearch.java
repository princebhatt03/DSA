
import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        System.out.println("Linear Search Algorithm");
        int arr[] = {2, 3, 4, 10, 40};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(" The Element " + target + " is found at index: " + i);
            }
        }
    }
}
