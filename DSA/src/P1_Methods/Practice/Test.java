package P1_Methods.Practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("Testing");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i <=num/2 ; i++) {
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
