package day52.books;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBookCounting {
    public static void main(String[] args) {

        Book b1=new PaperBook("java","Akbar",3);
        Book b2=new PaperBook("selenium","vasyl",2);
        Book b3=new AudioBook("agile","Guljannat",1.8);
        Book b4 = new PaperBook("The Kite Runner", "Khaled Hosseini", 3);
        Book b5 = new PaperBook("Lord of the Rings", "J. R. R. Tolkien", 2000);
        Book b6 = new AudioBook("Game of Thrones", "George R. R. Martin", 95.5);

        List<Book> bookList= Arrays.asList(b1,b2,b3,b4,b5,b6);

//        for (Book each:bookList) {
//            each.displayBookInfo();
//        }

        int countOfPaperBook=0;
        int countOfAudioBook=0;
        for (Book each:bookList) {
            if (each.getClass().getSimpleName().equalsIgnoreCase("PaperBook") ) {
                countOfPaperBook++;
            } else {
                countOfAudioBook++;
            }
        }
        System.out.println("Count of paperbook "+ countOfPaperBook);
        System.out.println("Count of audiobook "+ countOfAudioBook);




    }
}
