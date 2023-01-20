package _03_class_explained;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main firstInstance = new Main();
        firstInstance.sayHello();
        Main.sayIamFree();
    }
    String  name = new String("Daniel Ouattara");
    String country = "France";
    public void sayHello() {
        // This method require an instance to call it.
        System.out.println("Hello there");
    }

    public static void sayIamFree(){
        System.out.println("I don't need an instance of the class to run");
    }
}

/*
 //  comment

 class : Contains everything, and has members
 methods : do something
 properties : store something

 access modifier:

 public: anyone can use it/ call it / see it
 static: no instance of class is needed
 object: an instance of a class

*/
