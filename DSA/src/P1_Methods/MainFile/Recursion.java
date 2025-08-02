package P1_Methods.MainFile;

public class Recursion {

    static int factUsingRecursion(int num){
        if (num==0 || num==1){
            return 1;
        }
        else {
            return num * factUsingRecursion(num-1);
        }
    }

    public static void main(String[] args){
        System.out.println("Recursion");
//      Recursion in Java is function that can call itself...
        int n = 1;
        System.out.println("The Factorial of " + n + " is " + factUsingRecursion(n));
    }
}
