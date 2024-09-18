package MyFirstJavaPackage;

import java.util.Scanner;

public class NestedIfExercise {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Number : ");
        Scanner Value=new Scanner(System.in);
        int Number=Value.nextInt();
        if (Number % 2 == 0){
            System.out.println("The Value You Had Entered is Even");
            if (Number>=0 ) {
                System.out.println(" and Positive Number");
            }else{
                System.out.println("and Negative Number");
            }
        }else {
            System.out.println("The Value You Had Entered is Odd");
            if (Number>=0){
                System.out.println("and Positive Number");
            }else{
                System.out.println("and Negative Number");
            }
        }
        System.out.println();
        System.out.println("Slide 33");
    }
}
// Try to solve it using elseif
