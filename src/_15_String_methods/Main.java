package _15_String_methods;

public class Main {
    public static void main(String[] args) {
        String poem = "My oh my chicken pot pie";
        System.out.println(poem.charAt(0)); // M
        System.out.println(poem.charAt(4)); // h
        System.out.println(poem.charAt(9)); // c

        System.out.println(poem.indexOf("my")); // 6
        System.out.println(poem.lastIndexOf("pot")); // 17
        System.out.println(poem.indexOf("pot", 3)); // 17
        System.out.println(poem.lastIndexOf("pot", 3)); // -1 --> Nothing found

        System.out.println(poem.charAt(poem.length() - 1)); // e

        poem.concat(" and cheese along");
        System.out.println(poem);
        // Not Same as
        System.out.println(poem.concat(" and cheese along"));
        // Same as previous
        poem = poem.concat(" and cheese along");
        System.out.println(poem);

        System.out.println(poem.contains("chickens")); // false
        System.out.println(poem.contains("chicken")); // true
    }
}
