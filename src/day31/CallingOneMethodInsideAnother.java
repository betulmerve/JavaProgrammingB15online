package day31;

public class CallingOneMethodInsideAnother {

    //iki ayri methodu tek method icinde tekrar kullanabilirsin
    //boylece iki ayri seyi combine edip, digerlerinden de separete edebiliriz

    public static void main(String[] args) {
        finallyAwake();
    }

    public static void finallyAwake() {
        wakeUp();
        drinkCoffee();
    }


    public static void wakeUp() {
        System.out.println("Open your eye");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm? open it again");
        System.out.println("-----------------");
    }

    public static void drinkCoffee() {
        System.out.println("Put coffee in your machine");
        System.out.println("Make your coffee");
        System.out.println("-----------------");
    }


}
