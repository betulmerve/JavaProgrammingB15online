package day12;

public class CarShopping {

    public static void main(String[] args) {

        String carBrand="corolla";

        int budget=40000;
        int carPrice=60000;

        if (carBrand.equals("corolla") || carBrand.equals("tesla") && (carPrice<=budget)) {
            System.out.println("Car Acquired!");
        } else {
            System.out.println("Not what i am looking for");
        }


    }
}
