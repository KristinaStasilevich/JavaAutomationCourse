import java.util.Scanner;

public class Ebook extends Book {
    private String formatOfBook;
    private double fileSize;

    public Ebook(String bookName, String bookAuthor, int yearOfPublishing, Page[] pages, Cover cover,
                 String formatOfBook, double fileSize) {
        super(bookName, bookAuthor, yearOfPublishing, pages, cover);
        this.formatOfBook = formatOfBook;
        this.fileSize = fileSize;
    }
    @Override
    public String getBookDescription() {
        return String.format("Book name is %s, author of this book is %s, year of publishing is %d, " +
                        "number of pages is %d,\nсover size is %d x %d centimeters, book cover is %s, " +
                        "this book is in %s format and file size is %f MB.",
                bookName, bookAuthor, yearOfPublishing, pages.length, cover.length, cover.width, cover.typeOfCover,
                formatOfBook, fileSize);

    }

    public void downloadTheBook() {
        System.out.println("Book downloaded successfully.");
    }

    public void setFormatOfBook(String formatOfBook) {
        this.formatOfBook = formatOfBook;
    }

    public String getFormatOfBook() {
        return formatOfBook;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }
}
