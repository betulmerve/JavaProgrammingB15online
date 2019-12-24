package day14;

public class LastIndexOf {

    public static void main(String[] args) {

        //           012345678901
        String name="Game of Java"; // length is 12


        //find out last location the letter a shows up
        System.out.println(name.lastIndexOf("a"));
        //find out last location the space shows up
        System.out.println(name.lastIndexOf(" "));
        //find out last location the letters Ga shows up
        System.out.println(name.lastIndexOf("Ga"));
        //find out last location the letters Kawa shows up
        System.out.println(name.lastIndexOf("Kawa")); //olmadigi icin -1

        //if you dont want to use contains you can use indexOf like like below

        if (name.indexOf("Kawa") >-1 ) {

            System.out.println("Kawa found!");
        } else {
            System.out.println("Kawa is not found");
        }


    }
}
