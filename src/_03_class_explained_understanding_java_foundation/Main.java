package _03_class_explained_understanding_java_foundation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main firstInstance = new Main();
        firstInstance.sayHello(); // calling sayHello() using an instance of the class Main
        Main.sayIamFree(); // calling static method directly on class Main
    }
    public String  name = new String("Daniel Ouattara"); // property
    public String country = "France"; // property
    public void sayHello() {
        // This method require an instance to call it.
        System.out.println("I need an instance of class to be alive");
    }

    public static void sayIamFree(){
        System.out.println("I DON'T need an instance of the class to run");
    }
}

/*
 //  comment

 class : Contains everything, and has members
 methods : do something
 properties : store something
 arguments : what you pass to a method
 parameter : variables to store arguments, part of method definition
 statement : telling something to the computer


 access modifier:

 public: anyone can use it/ call it / see it
 static: no instance of class is needed
 object: an instance of a class

*/
