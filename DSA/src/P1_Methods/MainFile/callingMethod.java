package P1_Methods.MainFile;

public class callingMethod {

        int meth1(int num1, int num2){
        int avg = (num1+num2)/2;
        System.out.println("The Average of two numbers is: " + avg);
        return avg;
    }

    public static void main(String[] args){
        System.out.println("Calling a Method");
        callingMethod c1 = new callingMethod();
        c1.meth1(5,65);
    }
}
