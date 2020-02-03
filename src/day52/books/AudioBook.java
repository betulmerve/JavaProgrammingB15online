package day52.books;

public class AudioBook extends Book {

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    @Override
    public void displayBookInfo() {

        System.out.println("The name of audioBook is " + name
                + " and the author is " + author +
                ", the duration is " + duration + " min");
    }

    public void listen() {
        System.out.println("listening the audio book " + name + " by " + author);
    }
    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("Taking notes on the digital book by " + name +
                "writing the provided digital table ");

    }

    @Override
    public void showTableOfContent() {
        System.out.println("If you want to see Table of Content of " + name
                + " by " + author + " press ...");

    }
}
