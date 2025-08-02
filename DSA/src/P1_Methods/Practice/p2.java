package P1_Methods.Practice;

public class p2 {

    static void printStar(int num){
        for(int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("Practice Set Question 2");
//      WAP to Print Stars
        printStar(5);
    }
}
