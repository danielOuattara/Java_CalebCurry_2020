package _18_string_comparison_and_interning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = "let me in";
        System.out.println("Guess the password : ");

        Scanner scan = new Scanner(System.in);
        String guessed_password = scan.nextLine();

        System.out.println(password.equals(guessed_password)); // return "true" if OK!

    }
}
