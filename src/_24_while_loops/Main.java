package _24_while_loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Iterator - Comparison - Update

        //---------------------------------------------

        int iterator = 0;
        while (iterator <= 10) {
            System.out.println(iterator);
            iterator++;
        }

        //---------------------------------------------

        String password = "secret";
        Scanner scan = new Scanner(System.in);
        String user_password = "";

        while (!user_password.equals(password)) {
            System.out.print("Enter your password : ");
            user_password = scan.nextLine();
            if (!user_password.equals(password)) System.out.println("incorrect ");
        }
        scan.close();
    }
}
