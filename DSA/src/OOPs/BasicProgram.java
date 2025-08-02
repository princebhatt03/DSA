package OOPs;

import java.util.Scanner;

class ECommerceLoginSystem{
    Scanner sc = new Scanner(System.in);
    void userLogin(){
        System.out.println("Enter username: ");
        String uName = sc.nextLine();
        System.out.println("Enter Password: ");
        String userPassword = sc.nextLine();
        System.out.println("Username: " + uName);
        System.out.println("Password: " + userPassword);
    }

    void adminLogin(){
        System.out.println("Enter Admin Name: ");
        String aName = sc.nextLine();
        System.out.println("Enter AdminID: ");
        int adminID = sc.nextInt();
        System.out.println("Enter Password: ");
        String adminPassword = sc.nextLine();
        System.out.println("Admin Name: " + aName);
        System.out.println("Admin ID: " + adminID);
        System.out.println("Password: " + adminPassword);
    }
}

public class BasicProgram {
    public static void main(String[] args){
        System.out.println("Basic Login System using OOPs Concept");
        ECommerceLoginSystem e1 = new ECommerceLoginSystem();
//        e1.userLogin();
        e1.adminLogin();
    }
}
