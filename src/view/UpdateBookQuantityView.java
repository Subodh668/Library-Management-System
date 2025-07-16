package view;

import java.util.Scanner;
import controller.BookController;
import models.Book;

public class UpdateBookQuantityView {
    public static void updateBookQuantityView() {
        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter book number: ");
        int bookNumber = scanner.nextInt();
        System.out.println("Enter book quantity: ");
        int bookQuantity = scanner.nextInt();

        bookController.updateBookQuantity(bookNumber, bookQuantity);
    }
}