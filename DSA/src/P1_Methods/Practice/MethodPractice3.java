package P1_Methods.Practice;

import java.util.Scanner;

public class MethodPractice3 {

    static int avg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of Number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the Value of Number 2: ");
        int n2 = sc.nextInt();
        int avg = (n1+n2)/2;
        System.out.println("The Average of " + n1 + " and " + n2 + " is: " + avg);
        return avg;
    }

    public static void main(String[] args){
        System.out.println("Method Practice 3");
        System.out.println("Static Method for Finding Average");
        int FindAvg = avg();
    }
}
