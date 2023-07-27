package _54_fields;

import java.util.Arrays;

public class Main {
    static int superNumber = 5;
    String name;

    public static void main(String[] args) {
        System.out.println(superNumber);

        Main caleb = new Main();
        System.out.println(caleb.name); // null
        caleb.name = "Caleb Curry";
        System.out.println(caleb.name); // Caleb Curry

        System.out.println("------------------------");

        Main john = new Main();
        System.out.println(john.name); // null
        john.name = "John Doe";
        System.out.println(john.name); // John Doe
    }
}
