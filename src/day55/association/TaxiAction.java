package day55.association;

public class TaxiAction {

    public static void main(String[] args) {

        Engine en=new Engine("V6",400);

        Driver d1=new Driver("Merve",102);

        Taxi t1=new Taxi(101,en,d1);

        System.out.println("t1 = " + t1);

        Taxi t2=new Taxi(102,new Engine("V8",600),new Driver("Pedro",12345));

        System.out.println("t2 = " + t2);


        // how do I store the t2 plate number in a variable x ;
        int x=t2.plateNumber;
        // how do I store the t2 Driver field in a variable y ;
        Driver y=t2.drv;
        // how do I store the t2 Engine field in a variable z ;
        Engine z = t2.eng ;

        // print out driver name and car horse power
        // driver <name> is driving the taxi with horsepower <> on the highway

        System.out.println("t2.drv.name = " + t2.drv.name);
        System.out.println("t2.eng.horsePower = " + t2.eng.horsePower);

        //how do i get the fist char of driver name using t2
        System.out.println("t2.drv.name.charAt(0) = " + t2.drv.name.charAt(0));


    }

}
