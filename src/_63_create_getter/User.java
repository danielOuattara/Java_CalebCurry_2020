package _63_create_getter;

public class User {
    private String firstName;
    public String lastName;

    public String output() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }


}
