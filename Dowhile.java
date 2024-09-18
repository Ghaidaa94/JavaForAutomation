package MyFirstJavaPackage;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        System.out.println("Enter First Number ");
        Scanner First = new Scanner(System.in);
        int A = First.nextInt();
        System.out.println("Enter Second Number ");
        Scanner Second = new Scanner(System.in);
        int B = Second.nextInt();
        if (A != 0 && B != 0) do {
            int sum;
            sum = A + B;
            System.out.println("The Summation Value = " + sum);
            break;
        } while (A != 0 || B != 0);
        else {
            System.out.println("Invalid Calculation");
        }
        System.out.println();
        System.out.println("Slide 47");
    }
}
