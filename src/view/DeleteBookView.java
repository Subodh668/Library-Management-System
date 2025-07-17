package view;

import controller.BookController;

import java.util.Scanner;

public class DeleteBookView {
    public static void deleteBookView(){
        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter book id: ");
        int bookNumber = scanner.nextInt();
        //get the update response from database and display output
        if (bookController.deleteBook(bookNumber) > 0) {
            System.out.println("models.Book deleted");
        } else {
            System.out.println("Failed to delete book");
        }

    }
}
