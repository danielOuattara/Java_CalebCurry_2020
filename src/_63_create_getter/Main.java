package _63_create_getter;

public class Main {


    // TODO: incomplete, need setter, next video
    public static void main(String[] args) {

        User user_1 = new User();
        // user_1.firstName = "John";
        user_1.lastName = "Doe";

        String user_1FullName = user_1.output();
        System.out.println("user_1FullName: " + user_1FullName);

    }
}
