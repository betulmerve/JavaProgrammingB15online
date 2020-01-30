package office_hour.replit_239;

public class Main {

    public static void main(String[] args) {

        Dog d1=new Dog("Comar",12,"kurt");
        Dog d2=new Dog("Comar",2,"kurt");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        d1.getAgeInHumanYears();
        d2.getAgeInHumanYears();

        System.out.println("---------------");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        d1.setHumanYears(4);
        System.out.println("d1 = " + d1);





    }
}
