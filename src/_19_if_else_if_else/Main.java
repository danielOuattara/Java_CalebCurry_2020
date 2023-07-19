package _19_if_else_if_else;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = "let me in";
        System.out.print("Guess the password : ");

        Scanner scan = new Scanner(System.in);
        String guessed_password = scan.nextLine();

        System.out.println(password.equals(guessed_password)); // return "true" if OK!

        if (password.equals(guessed_password)) {
            System.out.println("Access granted, Welcome");
        } else {
            System.out.println("Access Denied");
        }
        System.out.println("Guessing password terminated !");
    }
}
