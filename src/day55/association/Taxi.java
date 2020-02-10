package day55.association;

public class Taxi {

     int plateNumber;
    // just like String , we have class Engine
    // so I can use it as data type for my field
     Engine eng;
     Driver drv;

    public Taxi(int plateNumber, Engine eng,Driver drv) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.drv=drv;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", eng=" + eng +
                ", drv=" + drv +
                '}';
    }
}
