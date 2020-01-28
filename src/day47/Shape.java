package day47;

public abstract class Shape {

    String name;
    int area;

    public Shape(String name) {
        this.name=name;

    }

    public abstract void calculateArea();

    //I want to enforce sub classes to provide toString method!!
    //cok mantikli
    public abstract String toString();


    }

