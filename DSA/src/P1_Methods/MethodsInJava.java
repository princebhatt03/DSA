package P1_Methods;

public class MethodsInJava {
//    Static Method:
    static int functionAdd(int x, int y){
        int sum = x+y;
        return sum;
    }
    int functionAvg(int a, int b){
        int avg = (a+b)/2;
        System.out.println(avg);
        return avg;
    }
    public static void main(String[] args){
        System.out.println("Methods in Java");
//      In Java if we are calling a non-static method in main method without creating its object then it
//      throw an error, if we want to call a non-static method then we have to create its object...
//      Calling a Static Method:
        int x = functionAdd(2,5);
        System.out.println(x);
//      Calling a Non-static Method:
        MethodsInJava m1 = new MethodsInJava();
        m1.functionAvg(12, 6);
    }
}
