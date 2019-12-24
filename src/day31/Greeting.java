package day31;

public class Greeting {

    public static void main(String[] args) {

        sayHelloTo("Merve");
        sayHelloTo("Batch 15");
    }
    //i want to create a method that do below
    // say hello the person's name I passed when i call this method
    //(String name) this is called Method Parameter

    public static void sayHelloTo(String name) {
        System.out.println("Hello " +name);

    }

}
