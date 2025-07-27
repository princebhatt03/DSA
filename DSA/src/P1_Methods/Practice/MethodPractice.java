package P1_Methods.Practice;

public class MethodPractice {

    int sum(int a, int b){
        int sum = a+b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Method Practice");
        MethodPractice m1 = new MethodPractice();
        m1.sum(2,3);
    }
}
