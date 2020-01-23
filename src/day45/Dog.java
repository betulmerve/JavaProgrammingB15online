package day45;

public class Dog extends Animal {

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.speak();
    }



    @Override
    public void speak() {
        System.out.println("BARK!!");
    }
}
