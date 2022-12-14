package entities;

import java.util.*;

public class Library {

    private Librarian librarian;
    private static ArrayList<Book> bookList = new ArrayList<>();

    // A list to store the requests for each book, ordered by time.
//    private Map<String, ArrayList<Book>> bookRequests;


//    private Map<String, Book> bookList;

    public static void main(String[] args) {
        bookList.add(new Book("War and Peace", "Tolstoy", 2));
        bookList.add(new Book("Moby Dick", "Melville", 1));
        bookList.add(new Book("Great Expectations", "Dickens", 1));

//        addBookToBookList(new Book("Great Expectations", "Dickens", 3));

//        Library1 lib = new Library1();


        printBookList();

//        System.out.println(findBook("Great Expectations"));

    }

    public Library() {
        // Initialize the map to store the books and their quantities.
        bookList = new ArrayList<>();
    }

    public static ArrayList<Book> getBookList() {
        return bookList;
    }

//    public static void addBookToBookList(Book book) {
//        Book foundBook = findBook(book.getTitle());
//        if (foundBook == null){
//            bookList.add(book);
//        } else {
//            foundBook.setNoOfCopies(book.getNoOfCopies());
//        }
//    }

    public static void printBookList(){
        System.out.println("You have " + bookList.size() + " items in your grocery list");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println((i+1) + ". " + bookList.get(i));
        }
    }

//    public static Book findBook(String bookTitle){
//        for (int i = 0; i < bookList.size(); i++) {
//            if (bookList.get(i).getTitle().equals(bookTitle)) return bookList.get(i);
////            System.out.println(bookList.get(i));
//        }
//        return null;
//    }

//    public void borrowBook(String bookTitle, User user){
//        // Check if the book is exists in the library.
//        Book foundBook = findBook(bookTitle);
//
//        if (foundBook != null){
//            // Check if the book has any copies left in the library.
//            if (foundBook.getNoOfCopies() > 0){
//                System.out.println("Something goes here");
//            } else {
//                System.out.println("The book you are requesting for is not available");
//            }
//        }else {
//            System.out.println("We don't have this book in our library");
//        }
//
//
//    }

//    public void returnBook(String bookTitle, User user, int noOfReturnedBooks){
//        // Check if the book is exists in the library.
//        Book foundBook = findBook(bookTitle);
//
//        if (foundBook != null){
//            // Check if the book has any copies left in the library.
//            if (foundBook.getNoOfCopies() > 0){
//                System.out.println("Something goes here");
//            } else {
//                System.out.println("The book you are requesting for is not available");
//            }
//        }else {
//            System.out.println("We don't have this book in our library");
//        }
//
//    }

}
