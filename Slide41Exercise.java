package MyFirstJavaPackage;

import java.util.Scanner;

public class Slide41Exercise {
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
        if (O==1){
            System.out.println("Answer = " + (X*Y));
        } else if (O==2) {
            System.out.println("Answer = " + (X-Y));
        } else if (O==3) {
            System.out.println("Answer = " + (X+Y));
        } else {
            System.out.println("wrong Choice");
        }
        System.out.println("");
        System.out.println("Slide 41");
    }
}
