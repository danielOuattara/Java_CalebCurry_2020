package _67_creating_custom_type_in_loop;

public class User {
    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }


}
