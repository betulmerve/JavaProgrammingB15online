package day42;

import day31.MethodPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieTheater {

        /*
    Add Setters to Movie Class
    Create List<Movie> yourFavoriteMovieLst  add 10 Movie Objects
    Print the name of the movies less than 2 hours
    Print all the Action movies
    If any Movie is longer than 2 hours Update the movie type to  Long(MovieType)
         for example : if type was Action -->> LongAction , Drama--> LongDrama
    Find out longest Movie name
     */

    public static void main(String[] args) {


        Movie m1=new Movie("Joker",2.5,"drama");
        Movie m2=new Movie("Parasite",1.5,"drama");
        Movie m3=new Movie("Maleficient",2,"science-fiction");
        Movie m4=new Movie("Dragon",3.5,"drama");
        Movie m5=new Movie("Fast and Furious",1,"action");
        Movie m6=new Movie("Upside",2.5,"animation");
        Movie m7=new Movie("Go Girl",2,"comedy");
        Movie m8=new Movie("Batman",1.5,"action");
        Movie m9=new Movie("Superman",3,"action");
        Movie m10=new Movie("Dark Night",3.5,"action");

        List<Movie> yourFavoriteMovieLst=new ArrayList<>(Arrays.asList(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10));

        System.out.println("Movies longer than 2 hours:");
        for (Movie each:yourFavoriteMovieLst) {
            if (each.getLength()>2) {
                System.out.println(each.getName());
            }
        }
        System.out.println();

        System.out.println("Action movies are:");
        for (Movie each:yourFavoriteMovieLst) {
            if (each.getGenre().equals("action")) {
                System.out.println(each.getName());
            }
        }

        System.out.println();


        for (Movie each:yourFavoriteMovieLst) {
            if (each.getLength()>2) {
                each.setGenre("Long"+each.getGenre());
            }
        }

        System.out.println();

        System.out.println("The longest movie name is:");
        String max=yourFavoriteMovieLst.get(0).getName();

        for (int x = 0; x < yourFavoriteMovieLst.size(); x++) {

            if (yourFavoriteMovieLst.get(x).getName().length()>max.length()) {
                max=yourFavoriteMovieLst.get(x).getName();
            }

        }

        System.out.println(max);








    }
}
