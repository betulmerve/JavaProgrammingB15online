package day47;

public class Rectangle extends Shape {

//    String name;
//    int area;
    int width;
    int height;

    public Rectangle(int width, int height) {
        //I want to set the name to word to Rectangle
        //i am reusing the functionality of superclass to set the name
        super("rectangle");
        this.width=width;
        this.height=height;

    }

    @Override
    public void calculateArea() {
        area=width*height;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
