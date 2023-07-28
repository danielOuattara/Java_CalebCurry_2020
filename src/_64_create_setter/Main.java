package _64_create_setter;

public class Main {

    public static void main(String[] args) {

        User user_1 = new User();
        user_1.setFirstName("John");
        user_1.setLastName("Doe");

        System.out.println("FullName: " + user_1.output());

    }
}
