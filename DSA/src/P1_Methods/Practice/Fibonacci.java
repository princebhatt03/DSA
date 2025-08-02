package P1_Methods.Practice;

import java.util.Scanner;

public class Fibonacci {

//  Using Recursive Method...
    static int recursiveFibo(int num){
        if (num<=1){
            return num;
        }
        else {
            return recursiveFibo(num-1) + recursiveFibo(num-2);
        }
    }

//  Using Iterative Method...
    static void itteFibo(int count){
        int a=0; int b=1;
        System.out.println("The Fibonacci Series (Iterative): ");
        for (int i=0;i<count;i++){
            System.out.println(a + " ");
            int next = a+b;
            a=b;
            b=next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        System.out.println("Fibonacci Series in Java using both Recursive and Iterative method");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers of Terms: ");
        int n = sc.nextInt();
        itteFibo(5);
        System.out.println("The Recursive method: ");
        for (int i = 0; i < n; i++){
            System.out.println(recursiveFibo(i) + " ");
        }
        System.out.println();
    }
}
