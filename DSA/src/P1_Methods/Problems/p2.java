package P1_Methods.Problems;

import java.util.Scanner;

public class p2 {
    static float avg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the num2: ");
        float num2 = sc.nextFloat();
        System.out.println("Enter the Num3: ");
        float num3 = sc.nextFloat();
        float avg = (num1+num2+num3)/3;
        System.out.println("The Average of " + num1 + ", " + num2 + " and " + num3 + " is: " + avg);
        return avg;
    }
    public static void main(String[] args){
        System.out.println("Problem 2");
        p2.avg();
    }
}
