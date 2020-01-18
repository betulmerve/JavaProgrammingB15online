package day42;

public class Movie {


    private String name;
    private double length;
    private String genre;

    // default constructor :
    // a constructor that give by compiler
    // only if you don't have any constructor in your class
    // it's invisible
    // and it has no parameter
    // it has no code inside

    public Movie() {
        System.out.println("empty movie");
    }

    // write a constructor to set all the fields value
    public Movie(String name, double length, String genre) {
        this.name=name;
        this.length=length;
        this.genre=genre;
    }

    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
