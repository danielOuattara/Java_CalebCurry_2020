package _25_do_while_loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Iterator - Comparison - Update

        //---------------------------------------------

        String password = "secret";
        Scanner scan = new Scanner(System.in);
        String user_password;

        do {
            System.out.print("Enter your password : ");
            user_password = scan.nextLine();
            if (!user_password.equals(password)) System.out.println("incorrect ");
        } while (!user_password.equals(password));
        scan.close();
    }
}
