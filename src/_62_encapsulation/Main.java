package _62_encapsulation;

public class Main {

    public static void main(String[] args) {

        User user_1 = new User();
        user_1.firstName = "John";
        user_1.lastName = "Doe";

        String user_1FullName = user_1.output();
        System.out.println("user_1FullName: " + user_1FullName);

    }
}
