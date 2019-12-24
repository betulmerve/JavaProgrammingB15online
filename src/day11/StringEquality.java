package day11;

public class StringEquality {

    public static void main(String[] args) {

        String name="Rabia"; //String literal. It is just quotation
        String name2= new String("Rabia");
        String name3="Rabia";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name==name2);
        System.out.println(name==name3);

        // the correct way of comparing String to get consistent result is
        // using one of the string object behaviour/method called equals method

        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

        // DO NOT EVER USE THE == TO CHECK STRING EQUALITY!!
    }
}
