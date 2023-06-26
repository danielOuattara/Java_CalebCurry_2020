package _16_more_String_methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String poem = "   My oh my chicken pot pie and cheese along  ";
        System.out.println(poem);
        System.out.println(poem.toUpperCase());
        System.out.println(poem.toLowerCase());
        System.out.println(poem.strip()); // white space includes: spaces, tab, newLine
        System.out.println(poem.stripLeading()); // white space includes: spaces, tab, newLine
        System.out.println(poem.stripTrailing()); // white space includes: spaces, tab, newLine
        System.out.println(poem.stripIndent()); // white space includes: spaces, tab, newLine

        System.out.println(poem.length()); //
        System.out.println(poem.substring(30));
        System.out.println(poem.substring(32, 41));

        String greetings = "Hello";
        System.out.println("Hello".equals("Hi")); // false
        System.out.println("Hello".equals("hello")); // false
        System.out.println("Hello".equalsIgnoreCase("hello")); // true

        String secret_password = "password";
        System.out.print("Enter your password : ");
        Scanner scanner = new Scanner(System.in);
        String user_password_input = scanner.nextLine();
        Boolean is_password_ok = user_password_input.equals(secret_password);

        if(is_password_ok){
            System.out.println("Access granted, Welcome");
        } else {
            System.out.println("Access Denied");
        }
        System.out.println(is_password_ok);

    }
}
