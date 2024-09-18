package MyFirstJavaPackage;

import java.util.Scanner;

public class IfExercise {
    public static void main(String[] args) {
        System.out.println("Enter the Mark Between 0-100");
        Scanner mark= new Scanner(System.in);
        int M=mark.nextInt();
        if (M>=0 && M<=100) {
            if (M>=0 && M<50) {
                System.out.println("The Student Failed");
            }
            if (M>=50 && M<=100) {
                System.out.println(" The Student Passed");
            }
        }else {
            System.out.println("Invalid Value");
            System.out.println();
            System.out.println("Slide 24");
        }
    }
}
