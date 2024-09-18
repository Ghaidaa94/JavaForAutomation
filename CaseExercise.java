package MyFirstJavaPackage;

import java.util.Scanner;

public class CaseExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a value between 1-4");
        int grade = scanner.nextInt();
        switch (grade) {
            case 1:
                System.out.println("The value is one");
                break;
            case 2:
                System.out.println("The value is two");
                break;
            case 3:
                System.out.println("The value is Three");
                break;
            case 4:
                System.out.println("The value is Four");
        }
        System.out.println("Slide 40");
    }

}
