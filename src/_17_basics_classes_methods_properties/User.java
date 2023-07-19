package _17_basics_classes_methods_properties;

public class User {
    // members of class = fields, methods and properties.

    public String firstName;
    public String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
