package P1_Methods.Practice;

import java.util.Scanner;

class func{
    void EvenOrNot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println(num + " is a Even Number");
        }
        else {
            System.out.println(num + " is a Odd Number");
        }
    }
}

public class MethodPractice5 {
    public static void main(String[] args){
        System.out.println("Method Practice");
        System.out.println("Even or Not");
        func f1 = new func();
        f1.EvenOrNot();
    }
}
