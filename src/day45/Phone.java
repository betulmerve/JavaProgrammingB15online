package day45;

public class Phone extends Electronic{


    // Sub class inherit every visible instance field and static field
    // Sub class inherit every visible instance method and static method
//    String brand;
//    static boolean useElectricity = true;
    double size;
    double price;


    public static void main(String[] args) {


        Phone p1=new Phone();
        p1.size=12;
        p1.price=399;
        p1.brand="Apple";
        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        // directly accessing the static field of same class in static method
        System.out.println(useElectricity);

        // how to call showBrand method
        p1.showBrand();

        // how to call displayUseElectricity static method
        displayElectricityUsage();
        // STATIC WAY
        Electronic.displayElectricityUsage();
        Phone.displayElectricityUsage();



    }
}
