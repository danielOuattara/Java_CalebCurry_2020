package _21_switch_statement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("enter your name : ");
        String user_name = scan.nextLine();
        switch (user_name) {
            case "John":
                System.out.println("Hello John, How are you ?");
                break;
            case "Anna":
                System.out.println("Nice to meet you !");
                break;

            default:
                System.out.println("Are you a new registered ?");
        }

        //-------------------------------------------------------------------

        System.out.print("enter your position : ");
        String user_position = scan.nextLine();
        switch (user_position) {
            case "CEO":
            case "CTO":
                System.out.println("Welcome Boss ! Take a drink please ");
                break;
            default:
                System.out.println("There is a self service for drinks up there.");
        }

        scan.close();
    }
}
