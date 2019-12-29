package day34;

import java.security.PublicKey;

public class MethodOverLoadingIntro {

    public static void main(String[] args) {

        System.out.println("Method overloading");
        System.out.println(12);


        String name="overloading";
        //two version of substring method
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));

        //two version of indexOf method
        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));
        System.out.println("----------------------");

        //what is method overloading?
        //using same name and different parameter for different methods
        //to reuse the name for similar actions
        //IT DOES NOT CONCERN RETURN TYPE AND ACCESS MODIFIER

        //method name+parameter list=method signature

        sayHello();
        sayHello("Merve");
        sayHello(100);
        System.out.println(sayHello("Muge","Orman"));

    }
    public static void sayHello() {
        System.out.println("Hello, world!");
    }
    public static void sayHello(String name) {
        System.out.println("Hello, "+name);
    }

    public static void sayHello(int num) {
        System.out.println("Hello, "+num);
    }

    public static String sayHello(String firstName, String lastName) {
        return "Hello "+firstName+" "+lastName;
    }

}
