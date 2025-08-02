package P1_Methods.MainFile;

public class VarArgs {

    static int sum (int... arr){
//      Available as int[] arr...
        int result = 0;
        for (int elem: arr){
            result+=elem;
        }
        return result;
    }

    static int compalsaryNum(int x, int... arr2){
        int result = x;
        for (int elem2 : arr2){
            result+=elem2;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println("Var Args");
        System.out.println("Welcome to Var Args");
        System.out.println("Empty Array: " + sum());
        System.out.println("The sum of Dynamic Numbers is: " + sum(2,3,23,4,56,77));
//        System.out.println("Empty Array: " + compalsaryNum()); : We Can't pass an empty Array to it as we have to pass one Value which is x
        System.out.println("Empty Array: " + compalsaryNum(21,2,3,4,2));
    }
}
