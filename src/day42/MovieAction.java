package day42;


public class MovieAction {

    public static void main(String[] args) {

        Movie m1=new Movie("Joker",2.2,"drama");
        System.out.println("m1 = " + m1);

        Movie m2=new Movie();
        System.out.println("m2 = " + m2);

        Movie m3=new Movie("Pursuit of happiness", 3.5,"family" );
        System.out.println("m3 = " + m3);

        // I WANT TO GET THE name OF M1 SEPARATELY SO I CAN DO SOME STUFF
        // I can not access the field directly because it's private
        // i need a getter method to access
        // System.out.println(m1.name);

        System.out.println(m1.getName());






    }
}
