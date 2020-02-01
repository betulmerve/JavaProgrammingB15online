package office_hour.replit_236;

public class BookParty {

    public static void main(String[] args) {

        Book b1=new Book();
        b1.setAuthor("mArufJon temirov");
        System.out.println("b1 = " + b1.getAuthor());
        b1.setAuthor("");
        System.out.println("b1 = " + b1.getAuthor());
        b1.setAuthor("MeRVE");
        System.out.println("b1 = " + b1.getAuthor());

        b1.setTitle("MaruF The cool");
        System.out.println("b1 = " + b1.getTitle());
        b1.setTitle("the Chronicles OF TrumP");
        System.out.println("b1 = " + b1.getTitle());

        Book book1, book2;
        book1 = new Book(44, "shel silverstein" ,"the Giving tRee",532);
        System.out.println("book1 = " + book1);
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPages());
        System.out.println(book1.getTitle());
        book2 = new Book(434, "Dan Brown" ,"the da Vinci coDe",1532);


        System.out.println(Shelf.addBook(book1));
        System.out.println(Shelf.addBook(book2));

        System.out.println(Shelf.getTitleByID(44));



    }
}
