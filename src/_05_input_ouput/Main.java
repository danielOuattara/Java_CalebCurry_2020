package _05_input_ouput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Type identifier = new Type()
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello " +  name);
 }
}
