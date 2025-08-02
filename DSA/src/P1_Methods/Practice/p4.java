package P1_Methods.Practice;

public class p4 {

    static void printStart(int num){
        for(int i = num; i  >= 0; i--) {
            for(int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("Practice Set Question 4");
//      WAP to Print Stars in Opposite...
        int stars = 5;
        printStart(5);
    }
}
