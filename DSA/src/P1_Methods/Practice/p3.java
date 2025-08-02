package P1_Methods.Practice;

import java.util.Scanner;

public class p3 {

    static int sum(int n){
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args){
        System.out.println("Practice Set Question 4");
//      WAP using Recursion to print sum of n natural Numbers...
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive Number: ");
        int n = sc.nextInt();
        if (n<=0){
            System.out.println("Please enter a positive integer.");
        }
        else {
            int result=sum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + result);
        }
    }
}
