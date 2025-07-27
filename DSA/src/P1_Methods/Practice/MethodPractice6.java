package P1_Methods.Practice;

import java.util.Scanner;

class userSystem {
    int createUserPassword;
    void userLogin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your UserID: ");
        int userID = sc.nextInt();
        System.out.println("Enter Your Password: ");
        int userPassword = sc.nextInt();
        System.out.println("Your UserID is: " + userID + " and your Password is: " + userPassword);
        if (userID!=0 && userPassword==createUserPassword){
            System.out.println("User Login Successfully!!");
        }
        else {
            System.out.println("Login Error, UserID or Password is Incorrect!!");
        }
    }
    void userRegister(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Create a UserID: ");
        int createUserID = sc.nextInt();
        System.out.println("Create a Password: ");
        createUserPassword = sc.nextInt();
        System.out.println("User Created Successfully");
    }
}

public class MethodPractice6 {
    public static void main(String[] args){
        System.out.println("Method Practice 6");
        userSystem u1 = new userSystem();
        u1.userLogin();
    }
}
