package MyFirstJavaPackage;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        System.out.println("Please Enter the value Between 1-100 : ");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        if (A >= 1 && A <= 100) {
            System.out.println("The Value You Had Entered is Between 1-100");
                if (A > 50 && A < 100) {
                    System.out.println("The Value You Had Entered is Between 50-100");
                } else if (A == 100) {
                    System.out.println("The Value You Had Entered = 100 ");
                }
        } else {
            System.out.println(" The Value You Had Entered is Invalid");

        }
    }
}

