package P1_Methods.Problems;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args){
        System.out.println("Factorial");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact*=i;
        }
        System.out.println("The factorial of given Number is: " + fact);
    }
}
