package P1_Methods.MainFile;

public class MethodIntro {

    static int meth1(int num1, int num2){
        int sum = num1+ num2;
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Method Introduction");
        int m1 = meth1(2,3);
        System.out.println(m1);
    }
}
