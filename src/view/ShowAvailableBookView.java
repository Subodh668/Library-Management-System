package view;

import controller.BookController;
import models.Book;
import java.util.ArrayList;

public class ShowAvailableBookView {
    public static void showAvailableBookView(){
        BookController bookController = new BookController();
        ArrayList<Book> bookList = new ArrayList<>();
        bookController.showAvailableBook(bookList);

    }

}
