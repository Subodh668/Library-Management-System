package controller;
import dao.BookDAO;
import models.Book;

import java.sql.SQLException;
import java.util.ArrayList;

public class BookController {
    private final BookDAO bookDAO;
    public BookController(){
        try {
            bookDAO = new BookDAO();
        }catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException();
        }
    }
    public int storeBook(Book book){
        return bookDAO.insertBook(book);
    }

    public ArrayList<Book> showAvailableBook(ArrayList<Book> bookList){
        return bookDAO.showAvailableBookView(bookList);
    }

    public int updateBookQuantity(int bookNumber, int bookQuantity){
        return bookDAO.updateBookQuantityView(bookNumber, bookQuantity);
    }

    public int deleteBook(int bookNumber){
        return bookDAO.deleteBookView(bookNumber);
    }
}
