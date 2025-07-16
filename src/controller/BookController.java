package controller;
import dao.BookDAO;
import models.Book;

import java.util.ArrayList;

public class BookController {
    public void storeBook(Book book){
        BookDAO bookDAO = new BookDAO();
        bookDAO.insertBook(book);
    }

    public void showAvailableBook(ArrayList<Book> bookList){
        BookDAO bookDAO = new BookDAO();
        bookDAO.showAvailableBookView(bookList);
    }

    public void updateBookQuantity(int bookNumber, int bookQuantity){
        BookDAO bookDAO = new BookDAO();
        bookDAO.updateBookQuantityView(bookNumber, bookQuantity);
    }

    public void deleteBook(int bookNumber){
        BookDAO bookDAO = new BookDAO();
        bookDAO.deleteBookView(bookNumber);
    }
}
