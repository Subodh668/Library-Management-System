package view;

import java.util.Scanner;
import controller.BookController;

public class UpdateBookQuantityView {
    public static void updateBookQuantityView() {
        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter book number: ");
        int bookNumber = scanner.nextInt();
        System.out.println("Enter book quantity: ");
        int bookQuantity = scanner.nextInt();
        //get the update response from database and display output
        if (bookController.updateBookQuantity(bookNumber, bookQuantity) > 0) {
            System.out.println("models.Book updated");
        } else {
            System.out.println("Failed to update book");
        }
    }
}