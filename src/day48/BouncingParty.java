package day48;

public class BouncingParty {

    public static void main(String[] args) {


        Kangaroo k1=new Kangaroo("Coco",10);
        System.out.println("k1 = " + k1);
        k1.bounce();
        k1.eat();


        Ball b1=new Ball("round","blue");
        System.out.println("b1 = " + b1);
        b1.bounce();







    }
}
