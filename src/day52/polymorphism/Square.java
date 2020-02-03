package day52.polymorphism;

public class Square extends Shape {

    int length;

    public Square(String name, int length) {
        super(name); //reusing functionality of superclass
        this.length=length;
    }


    @Override
    public void calculateArea() {
        area=length*length;
    }

    @Override
    public void draw() {
        System.out.println("4 equal lines with 90 degree, length "+ length +
                " with color of "+ COLOR);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
