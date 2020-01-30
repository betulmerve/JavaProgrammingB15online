package day49;

public class Circle extends Shape {


    int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public void calculateArea() {

        area=Math.PI*radius*radius;
    }

    @Override
    public void draw() {

        System.out.println("Drawing a circle with radius "+ radius + " with the color of "+ COLOR);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
