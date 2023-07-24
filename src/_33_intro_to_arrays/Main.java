package _33_intro_to_arrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] grades = new int [10];
        System.out.println(grades.length); // 10
        grades[1] = 12;
        System.out.println(Arrays.toString(grades)); // [0, 12, 0, 0, 0, 0, 0, 0, 0, 0]
    }
}
