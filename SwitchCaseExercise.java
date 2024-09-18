package MyFirstJavaPackage;

import java.util.Scanner;

public class SwitchCaseExercise {
    public static void main(String[] args) {
        System.out.println("Please Enter Value of X : ");
        Scanner Value = new Scanner(System.in);
        int X = Value.nextInt();
        System.out.println("Please Chose Your Operation : ");
        System.out.println("1 = *");
        System.out.println("2 = -");
        System.out.println("3 = +");
        Scanner Operation = new Scanner(System.in);
        int O = Operation.nextInt();
        System.out.println("Please Enter Your Value of Y : ");
        Scanner Value2 = new Scanner(System.in);
        int Y = Value2.nextInt();
        switch (O){
            case 1:
                System.out.println("Answer = " + (X*Y));
                break;
            case 2:
                System.out.println("Answer = " + (X-Y));
                break;
            case 3:
                System.out.println("Answer = " + (X+Y));
                break;
        }
        System.out.println("");
        System.out.println("Slide 41");
    }
}
