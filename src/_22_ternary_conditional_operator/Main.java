package _22_ternary_conditional_operator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //---------------------------------------------------
        System.out.print("enter the hour of the day :");
        int hours = scan.nextInt();
        String result = hours > 18 ? "Good Evening !" : "Good Day !";
        System.out.println(result);

        //---------------------------------------------------
        String name = "John";
        boolean welcome = name.equals("John") ? true : false;
        System.out.println(welcome);

        //---------------------------------------------------
        System.out.print("enter your name : ");
        String user_name = scan.nextLine();
        String output = user_name.trim().strip().equalsIgnoreCase("john") ? "Welcome John" : "Nice to meet you !";

        //---------------------------------------------------
        scan.close();
    }
}
