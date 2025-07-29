package P1_Methods.Problems;

import java.util.Scanner;

class check{
    void func1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <=num; i++) {
            fact*=i;
        }
        System.out.println("The Factorial of Number: " + num  + " is: " + fact);
    }
}

public class p4 {
    public static void main(String[] args){
        System.out.println("Method Practice");
        check c1 = new check();
        c1.func1();
    }
}
