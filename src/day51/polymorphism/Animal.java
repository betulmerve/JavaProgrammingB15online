package day51.polymorphism;

public abstract class Animal {

    public abstract void makeNoise();
//    {
//        System.out.println("general animal noise");
//    }
}

//i can add more classes as long as only one class is public and name is same as file name
class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("bark");
    }

}

class Horse extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("neinei");
    }
}
