package day52.polymorphism;

public abstract class Shape implements Drawable {

    String name;
    double area;

    //why abstract class has constructor? even we can not use it to create an obbject?
    //it exists purely to let sub class to call and reuse the functionality
    public Shape(String name) {
        this.name = name;
    }

    public abstract void calculateArea();

}
