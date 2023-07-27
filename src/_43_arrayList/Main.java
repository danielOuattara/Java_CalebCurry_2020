package _43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(2);
        grades.add(7);
        grades.add(9);
        //----
        grades.get(0); // 2
        grades.get(2); // 9
        //----
        grades.size(); // 3
        //----
        grades.contains(2); // true

        ArrayList<String> users = new ArrayList<>();
    }
}
