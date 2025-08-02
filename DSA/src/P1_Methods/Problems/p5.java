package P1_Methods.Problems;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args){
        System.out.println("Factorial of a Number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        long fact = 1;
        for(int i = 1; i <=num; i++) {
            fact*=i;
        }
        System.out.println("The Factorial of " + num + " is: " + fact);
    }
}
