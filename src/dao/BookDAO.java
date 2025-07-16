package dao;

import models.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {
    public void insertBook(Book book) {
        try {
            Connection conn = dao.DatabaseConnection.connect();
            String query = "INSERT INTO book(bookNumber, bookName, bookAuthor, bookQuantity) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, book.getBookNumber());
            ps.setString(2, book.getBookName());
            ps.setString(3, book.getBookAuthor());
            ps.setInt(4, book.getBookQuantity());
            if (ps.executeUpdate() > 0) {
                System.out.println("models.Book added to database");
            } else {
                System.out.println("Failed to add");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void showAvailableBookView(ArrayList<Book> bookList) {

        try {
            Connection conn = dao.DatabaseConnection.connect();

            String query = "SELECT bookNumber, bookName, bookAuthor, bookQuantity FROM book";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet bookSet = ps.executeQuery();
            while (bookSet.next()) {
                Book book = new Book(bookSet.getInt("bookNumber"), bookSet.getString("bookName"), bookSet.getString("bookAuthor"), bookSet.getInt("bookQuantity"));
                bookList.add(book);
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Book book : bookList) {
            System.out.println("models.Book Number: " + book.getBookNumber() + " models.Book Name: " + book.getBookName() + "Author: " + book.getBookAuthor() + " Quantity: " + book.getBookQuantity());
        }
    }

    public void updateBookQuantityView(int bookNumber, int bookQuantity) {
        try {
            Connection conn = dao.DatabaseConnection.connect();
            String query = "UPDATE book SET bookQuantity= ? WHERE bookNumber = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, bookQuantity);
            ps.setInt(2, bookNumber);
            if (ps.executeUpdate() > 0) {
                System.out.println("models.Book updated");
            } else {
                System.out.println("Failed to update book");
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteBookView(int bookNumber) {
        try {
            Connection conn = dao.DatabaseConnection.connect();
            String query = "DELETE FROM book WHERE bookNumber = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, bookNumber);
            if (ps.executeUpdate() > 0) {
                System.out.println("models.Book deleted");
            } else {
                System.out.println("Failed to delete book");
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
