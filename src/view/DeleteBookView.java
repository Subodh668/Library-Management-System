package view;

import controller.BookController;

import java.util.Scanner;

public class DeleteBookView {
    public static void deleteBookView(){
        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter book id: ");
        int bookNumber = scanner.nextInt();
        bookController.deleteBook(bookNumber);

    }
}
