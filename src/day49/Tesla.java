package day49;

public class Tesla extends Vehicle implements Autonomous,Chargeable{

    int horsePower;
    String model;

    @Override
    public void selfDrive() {

        System.out.println("Tesla model "+model+ " is self driving!");
    }

    @Override
    public void start() {

        System.out.println("Tesla model "+ model+ " start with electricity");
    }


    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    //we inherit from Chargeable interface
//    public void charge() {
//        System.out.println("Default charge!");
//    }

    //inherit from Vehicle abstract class
//    public void goForward() {
//        System.out.println("Vehicle going forward");
//    }

}
