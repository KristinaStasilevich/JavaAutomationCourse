import java.util.Scanner;

public class Book {
    protected String bookName;
    protected String bookAuthor;
    protected int yearOfPublishing;
    protected Page[] pages;
    protected Cover cover;

    protected Book(String bookName, String bookAuthor, int yearOfPublishing, Page[] pages, Cover cover) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPublishing = yearOfPublishing;
        this.pages = pages;
        this.cover = cover;
    }

    public void readTheBook() {
        System.out.println("Enjoy reading!");
    }

    public String getBookDescription() {
        return String.format("Book name is %s, author of this book is %s, year of publishing is %d, " +
                "number of pages is %d,\nсover size is %d x %d centimeters, book cover is %s.",
                bookName, bookAuthor, yearOfPublishing, pages.length, cover.length, cover.width, cover.typeOfCover);
    }

}
