package day44;

public class Course {

    String name;
    String type;

    static int counter;

    public Course(String name, String type) {
        this.name = name;
        this.type = type;
        counter++;
        // You can access static field
        // in constructor, instance method , static methods
    }

}
