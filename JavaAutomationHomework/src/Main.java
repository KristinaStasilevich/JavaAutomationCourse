import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cover cover = new Cover(25, 18, "soft");
        Page[] pages = {
                new Page(25, 18, 14, "Calibri"),
                new Page(25, 18, 11, "Arial"),
                new Page(25, 18, 11, "Arial"),
                new Page(25, 18, 11, "Arial"),
                new Page(25, 18, 11, "Arial"),
                new Page(25, 18, 11, "Arial"),
                new Page(25, 18, 11, "Arial"),
                new Page(25, 18, 11, "Arial"),
                new Page(25, 18, 11, "Arial"),
                new Page(25, 18, 11, "Arial"),
                new Page(25, 18, 11, "Arial"),
                new Page(25, 18, 10, "Arial")
        };

        Cover ebookCover = new Cover(30, 21, "virtual");
        Page[] pagesOfEbook = {
                new Page(30, 21, 12, "Calibri"),
                new Page(30, 21, 12, "Calibri"),
                new Page(30, 21, 12, "Calibri"),
                new Page(30, 21, 12, "Calibri"),
                new Page(30, 21, 12, "Calibri"),
                new Page(30, 21, 12, "Calibri"),
                new Page(30, 21, 12, "Calibri"),
                new Page(30, 21, 12, "Calibri"),
                new Page(30, 21, 12, "Calibri"),
                new Page(30, 21, 12, "Calibri"),
        };

        Book myBook = new Book("\"My book\"", "Kristina Stasilevich",
                                2024, pages, cover);
        Ebook myEbook = new Ebook("\"My eBook\"", "Kristina Stasilevich", 2024,
                pagesOfEbook, ebookCover, ".pdf", 100.25);



        System.out.println(myBook.getBookDescription());
        myBook.readTheBook();
        System.out.println(myEbook.getBookDescription());
        myEbook.downloadTheBook();
        myEbook.readTheBook();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter format of book: ");
        String myEbookFormat = sc.nextLine();
        myEbook.setFormatOfBook(myEbookFormat);
        System.out.println("Entered book format: " + myEbook.getFormatOfBook());

        System.out.println("Please, enter size of book: ");
        double myEbookFileSize = sc.nextDouble();
        myEbook.setFileSize(myEbookFileSize);
        System.out.println("Entered book size: " + myEbook.getFileSize());

        System.out.println(myEbook.getBookDescription());
    }
}
