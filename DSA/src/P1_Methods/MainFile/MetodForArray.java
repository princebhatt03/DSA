package P1_Methods.MainFile;

public class MetodForArray {

    static void change(int[] arr){
        arr[0] = 98;
    }

    public static void main(String[] args){
        System.out.println("Methods for Arrays");
        int[] marks = {23,45,56,78,99};
        change(marks);
        System.out.println("The Value after change is: " + marks[0]);
//      In case of Array, the value will be changed, but in case of variables the value is not change...
//      Because in case of Array, the reference is passed to the Method not the Array...
    }
}
