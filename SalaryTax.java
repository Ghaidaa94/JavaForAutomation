package MyFirstJavaPackage;

import java.util.Scanner;

public class SalaryTax {
    public static void main(String[] args) {
        System.out.println("Please Enter the Salary : ");
        Scanner Salary=new Scanner(System.in);
        int salary = Salary.nextInt();
        double tax = 0.0;
        if(salary == 1000) {
            tax = salary * 0.1;
        } else if (salary > 1000 && salary < 2000) {
            tax = salary * 0.15;
        } else if (salary >= 2000) {
            tax = salary * 0.2;
        }
        System.out.println(" The tax = " + tax);
        System.out.println();
        System.out.println("Slide 25");
    }
}
