package _23_single_line_if_statement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your name : ");
        String user_name = scan.nextLine();
        if (user_name.trim().strip().equalsIgnoreCase("john")) System.out.println("Welcome John");
        scan.close();
    }
}
