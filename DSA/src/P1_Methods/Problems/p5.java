package P1_Methods.Problems;

import java.util.Scanner;

class PrimeOrNot{
    void p(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i <num/2 ; i++) {
            if (num%i==0){
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println(num + " is a Prime Number");
        }
        else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}

public class p5 {
    public static void main(String[] args){
        System.out.println("Practice Question");
//      WAP to Check a number is Prime or not
        PrimeOrNot p1 = new PrimeOrNot();
        p1.p();
    }
}
