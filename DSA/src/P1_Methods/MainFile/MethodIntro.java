package P1_Methods.MainFile;

public class MethodIntro {

    static int sum(int num1, int num2){
        int sum = num1+num2;
        System.out.println("The Sum of two numbers is: " + sum);
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Method Introduction");
        int m1 = sum(2,3);
    }
}
