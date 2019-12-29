package day34;

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
        //using same name and different parameter for methods
        //to reuse the name for similar actions

        sayHello();
        sayHello("Merve");
        sayHello(100);

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

}
