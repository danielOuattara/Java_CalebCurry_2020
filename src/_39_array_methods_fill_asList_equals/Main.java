package _39_array_methods_fill_asList_equals;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // EQUALS

        int[] grades_1 = {1, 2, 3, 77, 4, 5, 7, 9};
        int[] grades_2 = {1, 2, 3, 77, 4, 5, 7, 9};

        System.out.println(grades_1 + " , " + grades_2);

        // Nothing
        if (grades_1 == grades_2) {
            System.out.println("Equal one");
        }
        // Nothing
        if (grades_1.equals(grades_2)) {
            System.out.println("Equal Two");
        }

        if (Arrays.equals(grades_1, grades_2)) {
            System.out.println("Equal Finally !");
        }

        System.out.println("-----------------------------------------------------");

        int[] grades_3 = {1, 2, 3, 77, 4, 5, 7, 9};
        int[] grades_4 = grades_3;
        int[] grades_5 = grades_3.clone();

        System.out.println(
                "grades_3 = " + grades_3 + "\n" + "grades_4  = " + grades_4 + "\n" + "grades_5 = " +
                        grades_5);

        // Nothing
        if (grades_3 == grades_4) {
            System.out.println("Equal One");
        }
        // Nothing
        if (grades_3.equals(grades_4)) {
            System.out.println("Equal Two");
        }

        if (Arrays.equals(grades_3, grades_4)) {
            System.out.println("Equal Finally !");
        }

        System.out.println("-----------------------------------------------------");

        // FILL

        int[] fill_grades = new int[5];
        Arrays.fill(fill_grades, 7);
        System.out.println("fill_grades " + Arrays.toString(fill_grades));

        int[] fill_grades_2 = {1, 1, 2, 1, 2};
        Arrays.fill(fill_grades_2, 7);
        System.out.println("fill_grades_2 " + Arrays.toString(fill_grades_2));

        String[] notes = new String[5];
        System.out.println("notes  = " + Arrays.toString(notes)); // before fill

        Arrays.fill(notes, "");
        System.out.println("notes  = " + Arrays.toString(notes)); // after fill

        Arrays.fill(notes, "Java");
        System.out.println("notes  = " + Arrays.toString(notes)); // after new fill

        System.out.println("-----------------------------------------------------");

        // ASLIST

        String[] hero_list = new String[5];
        System.out.println("hero_list  = " + Arrays.toString(hero_list)); // before fill

        Arrays.fill(hero_list, "Rust");
        System.out.println("hero_list  = " + Arrays.toString(hero_list)); // after new fill

        // over asList() method to see more details
        List<String> testing_asList = Arrays.asList(hero_list);
        System.out.println("testing_asList  = " + testing_asList);

        // List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");

        /* Changes made to the array will be visible in the returned list,
        and changes made to the list will be visible in the array. */
        Arrays.fill(hero_list, "Django");
        System.out.println("hero_list  = " + Arrays.toString(hero_list)); // after new fill
        System.out.println("testing_asList  = " + testing_asList);


    }
}
