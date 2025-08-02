package OOPs;

import java.util.Scanner;

class Employee{

    void EmployeeData(String name, long salary){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


public class OOPsIntroduction {
    public static void main(String[] args){
        System.out.println("Introduction to OOPs");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Name: ");
        String empName = sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        int salary = sc.nextInt();
        Employee e1 = new Employee();
        e1.EmployeeData(empName, salary);
    }
}
