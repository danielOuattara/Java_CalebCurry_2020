package _46_quickly_initialize_list_and_print_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/**
 * goto : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html
 * and look at 'All Implemented Interfaces'.
 * So 'ArrayList' implements 'List' as interface,
 * then possesses many props and method from 'List'
 * // interface on left  =   // implementations on right
 * List<Integer> grades = new ArrayList<Integer>();
 */
public class Main {
    public static void main(String[] args) {
        // How to initialize a List ?: create an array then convert that array to a List
        List<Integer> grades = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // best
        System.out.println("grades = " + grades);

        // Not optimal
        System.out.println("Arrays.toString(grades.toArray()) = " + Arrays.toString(grades.toArray()));
    }
}
