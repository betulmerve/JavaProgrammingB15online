package day40;

public class SpaceBattle {

    public static void main(String[] args) {

        SpaceShip s1=new SpaceShip();
        s1.name="Orville";
        s1.setInitialPosition(1,5);
//        System.out.println(s1);
//        s1.setDirection("up");
//        s1.move1Block();
//
//        System.out.println(s1);
//
//        s1.setDirection("abc");
//        s1.move1Block();
//
//        System.out.println(s1);
//
//        s1.move1Block("up");
//        System.out.println(s1);

        s1.move1Block("up");
        s1.move1Block("right");
        s1.move1Block("up");
        s1.move1Block("down");
        s1.move1Block("Home");
        System.out.println(s1);


        s1.moveShipMove("up",2);
        System.out.println(s1);










    }
}
