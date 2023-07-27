package _45_working_with_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * goto : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html
 * and look at 'All Implemented Interfaces'.
 * So 'ArrayList' implements 'List' as interface,
 * then possesses many props and method from 'List'
 *
 * REMEMBER : List is not a type; it is an interface ONLY
 */
public class Main {
    public static void main(String[] args) {
        // interface on left  =   // implementations on right
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(1);
        grades.add(2);
        grades.add(3);

        System.out.println("grades = " + grades);

        System.out.println("grades.get(0) = " + grades.get(0));

        // insert at position
        grades.add(1, 7);
        System.out.println("grades = " + grades);

        // get the index of a value
        System.out.println("grades.indexOf(100) = " + grades.indexOf(100)); // -1
        System.out.println("grades.indexOf(7) = " + grades.indexOf(7)); // 1

        // check if contains
        System.out.println("grades.contains(100) = " + grades.contains(100)); // false
        System.out.println("grades.contains(7) = " + grades.contains(7)); // true

        // check empty
        System.out.println("grades.isEmpty() = " + grades.isEmpty()); // false


        List<Integer> grades_2 = new LinkedList<Integer>();
        // check empty
        System.out.println("grades_2.isEmpty() = " + grades_2.isEmpty()); // true


    }
}
