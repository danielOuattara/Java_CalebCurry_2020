package _08_variables_in_depth;

public class Main {
    public static  final  double PI = 3.14159;
    public static void main(String[] args) {
        //------------
        int x; // declaration
        x = 5; // affectation
        x = 10;

        //------------
        int y = 5; // initialize = declaration + affectation

        //------------
        Integer z = 5;

        //------------
        final int MONTHS_IN_YEAR = 12;


        System.out.println(AreaCalculator(5));
    }

    public static double AreaCalculator(double radius) {
        return  2 * PI * radius;
    }
}
