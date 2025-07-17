package dao;

import models.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BookDAO {
    private final Connection conn;

    public BookDAO() throws  SQLException, ClassNotFoundException{
        this.conn = DatabaseConnection.connect();
    }

    public int insertBook(Book book) {
        try {
            String query = "INSERT INTO book(bookNumber, bookName, bookAuthor, bookQuantity) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, book.getBookNumber());
            ps.setString(2, book.getBookName());
            ps.setString(3, book.getBookAuthor());
            ps.setInt(4, book.getBookQuantity());
            return ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Book> showAvailableBookView(ArrayList<Book> bookList) {

        try {

            String query = "SELECT bookNumber, bookName, bookAuthor, bookQuantity FROM book";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet bookSet = ps.executeQuery();
            while (bookSet.next()) {
                Book book = new Book(bookSet.getInt("bookNumber"), bookSet.getString("bookName"), bookSet.getString("bookAuthor"), bookSet.getInt("bookQuantity"));
                bookList.add(book);

            }
            return bookList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public int updateBookQuantityView(int bookNumber, int bookQuantity) {
        try {
            String query = "UPDATE book SET bookQuantity= ? WHERE bookNumber = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, bookQuantity);
            ps.setInt(2, bookNumber);
            return ps.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int deleteBookView(int bookNumber) {
        try {
            String query = "DELETE FROM book WHERE bookNumber = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, bookNumber);
            return ps.executeUpdate() ;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
