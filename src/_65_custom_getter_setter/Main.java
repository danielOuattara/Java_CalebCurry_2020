package _65_custom_getter_setter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user_1 = new User();
        user_1.setFirstName("John");
        user_1.setLastName("Doe");

        System.out.println("FullName: " + user_1.getFullName());

        List<User> usersList = new ArrayList<User>();
        usersList.add(user_1);

        User user_2 = new User();
        user_2.setFirstName("Mike");
        user_2.setLastName("Tyson");

        usersList.add(user_2);

        //---------------------------

        System.out.println(usersList.get(0).getFullName());
        System.out.println(usersList.get(1).getFullName());
    }
}
