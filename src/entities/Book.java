package entities;

public class Book {
    private int noOfBorrowedBooks;
    private String title;
    private String author;
    private int noOfCopies;

//    private String type;

//    private static int bookId;


    public Book() {

    }

    public Book(String title, String author, int noOfCopies) {
        this.title = title;
        this.author = author;
        this.noOfCopies = noOfCopies;
        this.noOfBorrowedBooks = 0;
    }

    public int getNoOfBorrowedBooks() {
        return noOfBorrowedBooks;
    }

    public void setNoOfBorrowedBooks(int noOfBorrowedBooks) {
        this.noOfBorrowedBooks = noOfBorrowedBooks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
//        this.noOfCopies = this.noOfCopies + noOfCopies;
        this.noOfCopies = noOfCopies;
    }


    @Override
    public String toString() {
        return "Book{" +
                "noOfBorrowedBooks=" + noOfBorrowedBooks +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", noOfCopies=" + noOfCopies +
                '}';
    }
}
