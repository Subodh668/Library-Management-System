package view;

import controller.BookController;
import models.Book;
import java.util.ArrayList;

public class ShowAvailableBookView {
    public static void showAvailableBookView(){
        BookController bookController = new BookController();
        ArrayList<Book> bookList = new ArrayList<>();
        bookList = bookController.showAvailableBook(bookList);

        //get the book details from database and display output
        for (Book book : bookList) {
            System.out.println("models.Book Number: " + book.getBookNumber() + " models.Book Name: " + book.getBookName() + "Author: " + book.getBookAuthor() + " Quantity: " + book.getBookQuantity());
        }

    }

}
