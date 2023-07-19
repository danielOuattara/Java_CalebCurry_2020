package _11_numeric_data_types_and_properties;

public class Main {
    public static void main(String[] args) {
        int x = 5; // primitive
        Integer y = 5;  // object

        // calling static methods
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);
        System.out.println(Math.sqrt(-1));
        System.out.println(Double.isNaN(Math.sqrt(-1)));


    }
}
