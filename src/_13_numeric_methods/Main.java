package _13_numeric_methods;

public class Main {
    public static void main(String[] args) {

        int age = 39; // no methods, some props
        Integer super_age = 39; // methods & props

        // .max() is a static method: called directly on class
        // same for .compare(),
        System.out.println(Integer.max(01, 20));  // 20
        System.out.println(Integer.compare(4, 5));  // -1
        System.out.println(Integer.compare(15, 3));  // 1
        System.out.println(Integer.compare(3, 3));  // 0

        // same for .valueOf(): returns an Integer
        System.out.println(Integer.valueOf(12)); // 12
        System.out.println(Integer.valueOf("12")); // 12
        Integer output_valueOf = Integer.valueOf("39"); // 39 as Integer

        // System.out.println(Integer.valueOf("hello")); // Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"

        // same for .parseInt() : returns an int
        System.out.println(Integer.parseInt("12")); // 12
        int output_parseInt = Integer.parseInt("39"); // 39 as int

        // similar method and output type for double, boolean, float, long, ... char (?)

        System.out.println(Double.compare(23.32, 32.32));
    }
}
