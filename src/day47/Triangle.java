package day47;


public class Triangle extends Shape {

    int height;
    int base;

    public Triangle(String name, int height, int base) {
        super(name);
        this.height=height;
        this.base=base;
    }
    public void calculateArea() {
        area=(height*base/2);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
