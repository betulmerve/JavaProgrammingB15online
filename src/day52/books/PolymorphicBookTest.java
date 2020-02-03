package day52.books;

public class PolymorphicBookTest {

    public static void main(String[] args) {

        // We can refer the paper book object using
        // ---- its own type : PeperBook ; '
        // --- or it's super type : Book , Readable , KnowledgeBank , Object
        Book b1=new PaperBook("java","Akbar",3);
        b1.displayBookInfo();

        // this is the very similar idea as putting the small coffee cup into grande cup
        KnowledgeBank kb=b1;
        kb.takeNote();
        kb.showTableOfContent();

        System.out.println("---------------");

        Book b3=new AudioBook("agile","Guljannat",1.8);
        b3.showTableOfContent();
        b3.displayBookInfo();
        b3.takeNote();
        System.out.println("b3 = " + b3);






        Book b2=new PaperBook("selenium","vasyl",2);
        //Book b3=new AudioBook("agile","Guljannat",1.8);
        Book b4 = new PaperBook("The Kite Runner", "Khaled Hosseini", 3);
        Book b5 = new PaperBook("Lord of the Rings", "J. R. R. Tolkien", 2000);
        Book b6 = new AudioBook("Game of Thrones", "George R. R. Martin", 95.5);




    }
}
