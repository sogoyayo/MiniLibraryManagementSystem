package services.impl;

import entities.Book;
import entities.Library;
import services.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    Library library = new Library();

    private static ArrayList<Book> bookList = Library.getBookList();
    private static Book requestedBook = null;


    @Override
    public boolean checkBookAvailability(String bookTitle) {
        List<Book> bookList = library.getBookList();
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(bookTitle) && book.getNoOfCopies() >= 1) {
                requestedBook = book;
                return true;
            }
//            System.out.println(bookList.get(i));
        }
        return false;
    }

    @Override
    public Book findBook(String bookTitle) {
        for (int i = 0; i < library.getBookList().size(); i++) {
            if (library.getBookList().get(i).getTitle().equals(bookTitle)) return library.getBookList().get(i);
//            System.out.println(bookList.get(i));
        }
        return null;
    }

    public static Book getRequestedBook() {
        return requestedBook;
    }

    public static void setRequestedBook(Book borrowedBook) {
        LibraryServiceImpl.requestedBook = borrowedBook;
    }

    public static ArrayList getBookList(){
        return bookList;
    }
}
