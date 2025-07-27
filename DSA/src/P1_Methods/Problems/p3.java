package P1_Methods.Problems;

import java.util.Scanner;
import java.lang.String;

class func1{
    void strMid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to find the Middle: ");
        String str = sc.nextLine();
        int lenght = str.length();
        int halfLenght = (lenght/2);
        System.out.println("The Length of String is: " + lenght);
        System.out.println("The Middle of the String is: " + halfLenght + " that is: " + str.charAt(halfLenght));
    }
}

public class p3 {
    public static void main(String[] args){
        System.out.println("Problem 3");
        func1 f1 = new func1();
        f1.strMid();
    }
}
