public class Book {
    //attributes ->book number, name, quantity, author
    //TODO create the attributes
    private String bookNumber;
    private String bookName;
    private String bookAuthor;
    private int bookQuantity;

    //constructor method
    public Book(String bookNumber, String bookName, String bookAuthor, int bookQuantity){
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookQuantity = bookQuantity;
    }

    //getter methods
    public String getBookNumber() {
        return bookNumber;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    //setter methods
    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    //behaviour -> increase quantity, decrease quantity

    public void increaseQuantity(){
        this.bookQuantity++;
        System.out.println("need to work on this");
    }

    public void decreaseQuantity(){
        this.bookQuantity--;
        System.out.println("need to work on this");
    }


}
