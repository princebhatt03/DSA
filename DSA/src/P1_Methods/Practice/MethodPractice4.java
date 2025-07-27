package P1_Methods.Practice;

import java.util.Scanner;

class FactorialFunc{
    void Factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=num; i++){
            fact*=i;
        }
        System.out.println("The Factorial of " + num + " is: " + fact);
    }
}

class PrimeFunc{
    void PrimeOrNot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i=2; i<=num/2;i++){
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println(num + " is a Prime Number");
        }
        else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}

public class MethodPractice4 {
    public static void main(String[] args){
        System.out.println("Method Practice 4");
        System.out.println("Method to find Factorial/Prime of a Number");
        FactorialFunc f1 = new FactorialFunc();
//        f1.Factorial();
        PrimeFunc f2 = new PrimeFunc();
        f2.PrimeOrNot();
    }
}
