package view;

import java.util.Scanner;

import controller.BookController;
import models.Book;

public class AddBookView {
    public static void showAddBookView(){
        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter book name: ");
        String bookName = scanner.nextLine();
        System.out.println("Enter book Number: ");
        int bookNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter author name: ");
        String bookAuthor = scanner.nextLine();
        System.out.println("Enter book Quantity: ");
        int bookQuantity = Integer.parseInt(scanner.nextLine());
        Book book  = new Book(bookNumber, bookName, bookAuthor, bookQuantity);
        bookController.storeBook(book);
    }
}
