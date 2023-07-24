package _35_arrays_toString_and_deepToString;


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

        int[][] my_array_2d = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {30, 50, 70, 90},
        };
        System.out.println(Arrays.deepToString(my_array_2d));

        int[][][] my_array_3d = {
                {
                        {1, 2, 3},
                        {1, 2, 3},
                        {1, 2, 3},
                },                {
                        {1, 2, 3},
                        {1, 2, 3},
                        {1, 2, 3},
                },                {
                        {1, 2, 3},
                        {1, 2, 3},
                        {1, 2, 3},
                },

        };
        System.out.println(Arrays.deepToString(my_array_3d));
        System.out.println(my_array_3d[0][0][0]);
        System.out.println(my_array_3d[0][0][1]);
        System.out.println(my_array_3d[0][0][0]);
        System.out.println(my_array_3d[0][0][0]);
        System.out.println(my_array_3d[0][0][0]);

    }
}
