package MyFirstJavaPackage;

public class ForLoopExercise {
    public static void main(String[] args) {
        System.out.println();
        for (int i =1; i<=5 ;i++) {
            System.out.println("Table Number" + i);
            for (int J=10; J>=1 ;J--){
             int cross=i*J;
                System.out.println(i + "*" + J + "=" + cross);
            }
            System.out.println();
        }
        System.out.println("Slide 26");
        System.out.println("Thank You");
    }
}
