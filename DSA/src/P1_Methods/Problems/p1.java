package P1_Methods.Problems;

import java.util.Scanner;

class fuc1{
    void smallestNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Number 3: ");
        int num3 = sc.nextInt();
        if (num1<num2 && num1<num3){
            System.out.println(num1 + " is the Smallest Number as the Value of num2 is: " + num2 + " and num3 is: " + num3);
        }
        else if(num2<num1 && num2<num3){
            System.out.println(num2 + " is the Smallest Number as the Value of num1 is: " + num1 + " and num3 is: " + num3);
        }
        else if(num3<num1 && num3<num2){
            System.out.println(num3 + " is the Smallest Number as the Value of num1 is: " + num1 + " and num2 is: " + num2);
        }
        else {
            System.out.println("Enter Valid Numbers");
        }
    }
}

public class p1 {
    public static void main(String[] args){
        System.out.println("Problem 1");
//      Write a Java method to find the smallest number among three numbers
        fuc1 f1 = new fuc1();
        f1.smallestNum();
    }
}
