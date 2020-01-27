package office_hour;

public class Book {
String title, author;
String tableOfContents="";
int nextPage=1;

public Book(String title, String author) {
    this.title=title;
    this.author=author;

}

public String addChapter(String title, int pages ) {
    String newline=title+"..."+nextPage+tableOfContents;
    nextPage+=pages;
    return newline;
}

public int getPages() {
    return nextPage;
}

public String  getTableOfContents() {
    return tableOfContents;
}

    @Override
    public String toString() {
        return title+author;
    }
}



/*

A method named addChapter that accepts two parameters.
The first, of type String, is the title of the chapter; the second, is an integer containing the number of pages in the chapter.
addChapter appends (that is concatenates) a newline followed by the chapter title followed by the string "..."
followed by the value of the nextPage instance variable to the tableOfContents.
The method also increases the value of nextPage by the number of pages in the chapter.
A method named getPages that accepts no parameters. getPages returns the number of pages in the book.
A method named getTableOfContents that accepts no parameters.
getTableOfContents returns the values of the tableOfContents instance variable.
A method named toString that accepts no parameters.
toString returns a String consisting of the value of title, followed by a newline character, followed by the value of author.
 */
