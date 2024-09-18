package MyFirstJavaPackage;

import java.util.Scanner;

public class Slide37 {
    public static void main(String[] args) {
        System.out.println("Please Enter the Value :");
        Scanner Value = new Scanner(System.in);
        int number = Value.nextInt();
        if (number > 0 && number < 100) {
            if (number != 100) {
                System.out.println("Not Equal to : 100");
                if (number <= 10 && number >= 1) {
                    System.out.println("Your Value Between 1-10");
                } else if (number >= 50 && number < 100) {
                    System.out.println("Your Value Between 50-100");
                }
            }
        }else {
                System.out.println("Invalid Value");
            }
        }
    }
