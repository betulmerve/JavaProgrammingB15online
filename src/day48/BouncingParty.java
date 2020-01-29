package day48;

public class BouncingParty {

    public static void main(String[] args) {


        Kangaroo k1=new Kangaroo("Coco",10);
        System.out.println("k1 = " + k1);
        k1.bounce();
        k1.eat();
        k1.carryChildInThePocket();
        k1.kickBox();

        //SuperType variableName= new SubType(...)  This works!!
        //List<Integer> lst=new ArrayList<>();

        //Kangaroo obj bu sekilde olusturdgumuz zaman, sadece .bounce cikiyor
        //digerleri cikmiyor!!!
        Bouncible k2=new Kangaroo("Toto", 5);
        k2.bounce();
        System.out.println("k2 = " + k2);


        //ayni sekilde bunlarda da sadece carryChildInThePocket ve kickBox cikiyor
        BoxerWithBellyPouch k3=new Kangaroo("Bingo",3);
        k3.carryChildInThePocket();
        k3.kickBox();
        System.out.println("k3 = " + k3);


        Ball b1=new Ball("round","blue");
        System.out.println("b1 = " + b1);
        b1.bounce();


        System.out.println(Bouncible.GRAVITY);








    }
}
