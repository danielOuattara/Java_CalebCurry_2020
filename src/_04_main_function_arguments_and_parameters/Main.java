package _04_main_function_arguments_and_parameters;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        System.out.println("Hello " + args[0]);
 }
}


/*
in the terminal run:
--------------------

javac _04_main_function_arguments_and_parameters/Main.java
java _04_main_function_arguments_and_parameters.Main
java _04_main_function_arguments_and_parameters.Main Daniel (if argument call needed)
//-----
javac Arguments.java --> compilation
java _04_main_function_arguments.Arguments Daniel --> execution

to output "Hello Daniel"

 */