package _34_working_with_arrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] grades = new int[10];
        System.out.println(grades.length); // 10
        grades[1] = 12;
        System.out.println(Arrays.toString(grades)); // [0, 12, 0, 0, 0, 0, 0, 0, 0, 0]

        //---------------------------------------------------

        int[] myNum = {10, 20, 30, 40};
        System.out.println(Arrays.toString(myNum));

        myNum[0] = 15;
        System.out.println(Arrays.toString(myNum));
    }
}
