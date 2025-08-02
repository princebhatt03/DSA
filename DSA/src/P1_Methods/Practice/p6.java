package P1_Methods.Practice;

import java.util.Scanner;

public class p6 {

    static int fac(int num){
        if(num<=1){
            return num;
        }
        else {
            return fac(num-1)+fac(num-2);
        }
    }

    public static void main(String[] args){
        System.out.println("Practice Set Question 6");
        System.out.println("Recursive FAC");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println(fac(i) + " ");
        }
    }
}
