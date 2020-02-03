package day51.polymorphism;

public abstract class Shape {

    public abstract void draw();

}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}



