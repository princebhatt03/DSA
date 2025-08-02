package P1_Methods.Problems;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args){
        System.out.println("Prime or Not");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < num/2; i++) {
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num + " is a Prime Number");
        }
        else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
