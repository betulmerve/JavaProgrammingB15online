package day45;

public class Electronic {

    String brand;
    static boolean useElectricity=true;

    public void showBrand() {
        System.out.println("brand = " + brand);
    }

    public static void displayElectricityUsage() {
        System.out.println("displaying useElectricity = " + useElectricity);
    }
}
