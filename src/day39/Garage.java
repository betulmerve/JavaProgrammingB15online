package day39;

public class Garage {

    public static void main(String[] args) {

        // Create car object using Class
        // or
        // Get an instance of Car class

        Car c1=new Car();

        c1.year=2020;
        c1.model="Tesla";
        c1.make="X";
        c1.color="White";
        c1.goForward();
        c1.printCarAge();
        c1.changeColorTo("Blue");

        System.out.println(c1.year+" | "+c1.model+" | "+ c1.make+" | "+ c1.color);

        Car c2=new Car();
        c2.year=2010;
        c2.model="Toyota";
        c2.make="Prius";
        c2.color="Red";
        c2.goForward();
        c2.printCarAge();


        System.out.println(c2.year+" | "+c2.model+" | "+ c2.make+" | "+ c2.color);


        // I WANT TO CHANGE THE COLOR OF Tesla TO THE COLOR OF Toyota
        c1.color=c2.color;

        System.out.println("c1 color is "+ c1.color);
    }
}
