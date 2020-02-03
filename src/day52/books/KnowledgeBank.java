package day52.books;

public interface KnowledgeBank {

    public abstract void takeNote();
    public default void showTableOfContent() {
        System.out.println("Chaper 1 till Chapter 10 : you do the rest");
    }
}
