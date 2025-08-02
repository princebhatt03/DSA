package P1_Methods.Practice;

public class p1 {

    static void table(int num){
        for(int i = 1; i <=10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }

    public static void main(String[] args){
        System.out.println("Practice Question 1");
//      WAP to Print Multiplication Table of a Number
        table(5);
    }
}
