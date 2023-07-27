package _44_list_interface_arrayList_implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // interface on left  =   // implementations on right
        List<Integer> grades = new ArrayList<Integer>();
        List<Integer> grades_2 = new LinkedList<Integer>();

        /**
         * goto : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html
         * and look at 'All Implemented Interfaces'.
         * So 'ArrayList' implements 'List' as interface,
         * then possesses many props and method from 'List'
         */

    }
}
