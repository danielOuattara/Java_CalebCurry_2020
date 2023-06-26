package _14_String_class;

public class Main {
    public static void main(String[] args) {

        // In Java, all string items are instance of String class
        String first_name = "John ";
        // OR
        String last_name = new String("Doe");
        System.out.println(first_name + " " + last_name);
        System.out.println(first_name + last_name);

        System.out.println(first_name.charAt(0));
        System.out.println(first_name.charAt(1));
        // System.out.println(first_name.charAt(4)); // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 4

        String string_with_special_chars = "Hello\n\\\\\nfrom cats \tand mice";
        System.out.println(string_with_special_chars);

        String animals = "Cats, Dogs";
        System.out.println(animals);
        System.out.println(animals + ", Birds");

        animals += ", Mice";
        System.out.println(animals);

        System.out.println(String.format("Hello %s", first_name));
        // OR
        System.out.printf("Hello %s%s%n", first_name, last_name);

        System.out.println(first_name.length()); // 5
    }
}
