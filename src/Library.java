import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Library {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //objects of book
        Book book1 = new Book(1, "Physics", "Ram Barma", 10);
        Book book2 = new Book(2, "Chemistry", "Som Nath", 10);
        Book book3 = new Book(3, "Maths", "Chris Adam", 10);
        Book book4 = new Book(4, "English", "Nuna Bears", 10);
        Book book5 = new Book(5, "Nepali", "Aman Malik", 10);

        try {
            Connection conn = DatabaseConnection.connect();
            String query = "INSERT INTO book(bookNumber, bookName, bookAuthor, bookQuantity) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,book2.getBookNumber());
            ps.setString(2,book2.getBookName());
            ps.setString(3,book2.getBookAuthor());
            ps.setInt(4, book2.getBookQuantity());
            if(ps.executeUpdate() > 0){
                System.out.println("Book added to database");
            }else {
                System.out.println("Failed to add");
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //objects of user
        User user1 = new User(1,"Shila Acharya", "98066066066");
        User user2 = new User(2,"Purnima Timilsina", "98066066067");
        User user3 = new User(3,"Hari Bahadur", "98066066068");
        User user4 = new User(4,"Anjali Gurung", "98066066069");
        User user5 = new User(5,"Vineet Chaudhary", "98066066070");
        //TODO show available options\
        // show available books, borrow books, return book
        while(true) {
            System.out.println("Welcome to the library");
            System.out.println("Enter 1: Show available books");
            System.out.println("Enter 2: Borrow book");
            System.out.println("Enter 3: Return book");
            System.out.println("Enter 4: Exit");
            System.out.println("Choose one option: ");

            int userChoice = scanner.nextInt();
            if (userChoice == 1){
                System.out.println("\nWorking on displaying available books\n");

            } else if (userChoice == 2) {
                user1.borrowBook(user1, book1);
                System.out.println("\nWorking on borrowing books\n");

            } else if (userChoice == 3) {
                System.out.println("\nWorking on returning books\n");
            } else if (userChoice == 4) {
                System.out.println("\nExiting program, Thank you!\n");
                break;
            }else {
                System.out.println("\nInvalid choice, Please enter the valid choice: '1','2','3'or'4'\n");
            }
        }

        //TODO create some books and users
        //TODO need to figure out where to keep the boooks?
    }





}
