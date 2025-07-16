package view;

import controller.ViewController;

import java.util.Scanner;

public class MenuView {
    public static void showMenuView() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        //show available options
        System.out.println("\nWelcome to the library");
        System.out.println("Enter 1: View available books");
        System.out.println("Enter 2: Add book");
        System.out.println("Enter 3: Update book quantity");
        System.out.println("Enter 4: Delete book");
        System.out.println("Enter 5: Borrow Book");
        System.out.println("Enter 6: Return book");
        System.out.println("Enter 7: Exit");
        System.out.println("Choose one option: ");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                //show views related to available books
                ViewController.getShowAvailableBookView();
            }else if (userChoice == 2) {
                //Show views related to adding books
                ViewController.getAddBookView();
            } else if (userChoice == 3) {
                //update book quantity
                ViewController.getUpdateBookQuantityView();
            } else if (userChoice == 4) {
                //delete book
                ViewController.getDeleteBookView();
            } else if (userChoice == 5) {
                //borrow book
                System.out.println("Borrow book to be implemented");
            } else if (userChoice == 6) {
                //return book
                System.out.println("Returning book to be implemented");
            } else if (userChoice == 7) {
                System.out.println("\nExiting program, Thank you!\n");
                break;
            }else {
                System.out.println("\nInvalid choice, Please enter the valid choice from the given options\n");
            }
        }
    }
}
