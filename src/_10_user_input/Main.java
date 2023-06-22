package _10_user_input;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("your name is " + name + " you are " + age + " y.o");

        System.out.println("what is the value of PI = ");
        BigDecimal PI = scanner.nextBigDecimal();
        System.out.println(PI);

        System.out.print("Are you an airline pilot ? ");
        boolean isPilot = scanner.nextBoolean();
        System.out.println(isPilot);

        System.out.print("Enter an integer from to become hexadecimal :");
        int number = scanner.nextInt(16);
        System.out.println(number);

        // casting

        System.out.print("enter an integer number: ");
        double x = scanner.nextInt();
        System.out.println("you typed in a \"integer\" which is automatically casted to \"double\", result is : " + x);

        System.out.print("enter a double number: ");
        int y = (int) scanner.nextDouble();
        System.out.println("you typed in a \"double\" which is manually casted to \"int\", result is : " + y);

        scanner.close();
    }
}
