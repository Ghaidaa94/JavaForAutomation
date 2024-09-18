package MyFirstJavaPackage;

public class ArrayExercise {
    public static void main(String[] args) {
        String[] Courses = {"c#", "C++", "Java", "Javascript"};
        System.out.println("All Courses :");
        for (int i = 0; i<Courses.length; i++) {
            //Print Array Courses
            //int [] Programs = new int[i];
            System.out.println(Courses[i]);
        }
            // Print Only Java
        System.out.println();
            System.out.println("Only Java :" + Courses[2]);

            //Print the Length of the Array
            int length = Courses.length;
        System.out.println();
            System.out.println("The Length of the Array : " + length);
        }
    }
