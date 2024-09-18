package MyFirstJavaPackage;

import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Age :");
        Scanner Value= new Scanner(System.in);
        int Age=Value.nextInt();
        if (Age>0){
            System.out.println("Valid Value");
            if (Age>=18  &&  Age<=60){
                System.out.println("You Are Allow to Login");
            } else if (Age<18) {
                System.out.println("Sorry!! You Can Not Login");
            } else if (Age>60) {
                System.out.println("Sorry!! You Can Not Login");
            }
        } else if (Age<0) {
            System.out.println("Invalid Value");
        }
        System.out.println();
        System.out.println("Slide 31");
    }
}
