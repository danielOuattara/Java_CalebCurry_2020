package _20_comparison_and_logical_operator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("how old are you ?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.print(" Cats or Dogs ?");
        String animal = scanner.nextLine();

        if(age >12 ) {

        }


        scanner.close();
    }
}


/*
comparison operator:
--------------------
==
!=
<
>
<=
>=

logical operator:
-----------------
&&
||
!

 */
