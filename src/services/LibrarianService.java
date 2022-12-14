package services;

import entities.Book;
import entities.User;

public interface LibrarianService {
    void bookRequestBaseOnStatus(User user, String bookTitle);

    void administerByStatus();

    void bookRequestBasedOnFirstComeFirstServe(User user, String bookTitle);

    void updateBook();

    void administerByFirstComeFirstServe();

    void addBookToBookList(Book book);

    void borrowBook();
}
