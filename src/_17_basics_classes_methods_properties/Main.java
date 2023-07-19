package _17_basics_classes_methods_properties;

public class Main {
    public static void main(String[] args) {
        User user_1 = new User();
        user_1.firstName = "John";
        user_1.lastName = "Doe";

        System.out.println(user_1.getFullName());

    }
}

