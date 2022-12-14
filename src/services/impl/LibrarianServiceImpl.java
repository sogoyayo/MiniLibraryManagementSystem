package services.impl;

import entities.Book;
import entities.Library;
import entities.User;
import enums.Status;
import services.LibrarianService;

import java.util.*;


public class LibrarianServiceImpl implements LibrarianService {

    LibraryServiceImpl libServiceImpl = new LibraryServiceImpl();

    private static ArrayList<Book> bookList = Library.getBookList();

    Queue<User> bookRequestOnFirstComeFirstServe = new PriorityQueue<>();

    Deque<User> bookRequestOnStatus = new ArrayDeque<>();


    @Override
    public void bookRequestBaseOnStatus(User user, String bookTitle) {
        if (libServiceImpl.checkBookAvailability(bookTitle)){
            if (user.getStatusName().equals(Status.TEACHER)){
                bookRequestOnStatus.offerFirst(user);
            } else if (user.getStatusName().equals(Status.SENIOR_STUDENT)) {
                bookRequestOnStatus.offer(user);
            } else if (user.getStatusName().equals(Status.JUNIOR_STUDENT)) {
                bookRequestOnStatus.offerLast(user);
            }else {
                System.out.println("Invalid user status");
            }
        } else {
            System.out.println("Book is currently not available");
        }

    }

    @Override
    public void administerByStatus() {
        if (bookRequestOnStatus.isEmpty()){
            System.out.println("Sorry, no book request has been placed");
        }else {
            User user = bookRequestOnStatus.pollFirst();

        }
    }

    @Override
    public void bookRequestBasedOnFirstComeFirstServe(User user, String bookTitle) {
        if (libServiceImpl.checkBookAvailability(bookTitle)){
            bookRequestOnFirstComeFirstServe.offer(user);

        } else {
            System.out.println("Book is currently not available");
        }
    }

    @Override
    public void updateBook() {
        for (Book book : bookList) {
            if (LibraryServiceImpl.getRequestedBook().getTitle().equals(book.getTitle())){
                book.setNoOfCopies(book.getNoOfCopies() - 1);
                book.setNoOfBorrowedBooks(book.getNoOfBorrowedBooks() + 1);
            }
        }
    }

    @Override
    public void administerByFirstComeFirstServe() {
        User user = bookRequestOnFirstComeFirstServe.remove();
        borrowBook();
    }

    @Override
    public void addBookToBookList(Book book) {
        Book foundBook = libServiceImpl.findBook(book.getTitle());
        if (foundBook == null){
            LibraryServiceImpl.getBookList().add(book);
        } else {
            foundBook.setNoOfCopies(book.getNoOfCopies());
        }
    }

    @Override
    public void borrowBook() {
        Book requestedBook = null;

        for (Book book : bookList) {
            if (LibraryServiceImpl.getRequestedBook().getTitle().equals(book.getTitle())){
                requestedBook = book;
            }
            assert requestedBook != null;
            if (requestedBook.getNoOfCopies() == 0){
                System.out.println(requestedBook.getTitle() + " is not available at the moment");
            } else {
                updateBook();
                System.out.println(requestedBook.getTitle() + " has been given out");
            }
        }
    }

}
