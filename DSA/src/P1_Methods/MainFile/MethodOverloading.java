package P1_Methods.MainFile;

public class MethodOverloading {

    static void greet(){
        System.out.println("Good Morning...");
    }

    static void greet(String a){
        System.out.println("Good Morning " + a);
    }

    static void greet(int a){
        System.out.println("Good Morning");
        System.out.println("The value of a is: " + a);
    }

    static void greet(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void main(String[] args){
        System.out.println("Method Overloading in Java");
//      Method Overloading: A Method with same name, but different Parameter
//      The difference may be the number/type of the parameter...
//      We can't do Method Overloading by changing the Return type...
        greet();
        greet("Prince");
        greet(34);
        greet(23,12);
    }
}
