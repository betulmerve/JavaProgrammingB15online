package day14;

public class IndexOfPractice {

    public static void main(String[] args) {

        // index of
        // find out index of another String inside this String
        //           012345678901
        String name="Game of Java"; // length is 12

        // find out the location of Java
        System.out.println(name.indexOf("Java"));  // kelimenin ilk harfinin yeri

        // find out the location of letter o
        System.out.println(name.indexOf("o"));  //5

        // find out the location of first space
        System.out.println(name.indexOf(" "));

        // if the location is not found we get - number
        System.out.println(name.indexOf("M"));

        // find out the location of letter o
        System.out.println(name.indexOf("a"));  // ilk olani aliyor


    }
}
