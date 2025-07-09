public class User {
    private String userName;
    private String contactNo;


    public User( String userName, String contactNo) {
        this.userName = userName;
        this.contactNo = contactNo;

    }

    //getter methods
    public String getUserName() {
        return userName;
    }

    public String getContactNo() {
        return contactNo;
    }

    //setter methods
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //behaviours
    //TODO check if user registered
    public void isRegistered(){
        System.out.println("need to work on checking registered");
    }

    //TODO borrow a book
    public void borrowBook(User user, Book book){
        if (book.getBookQuantity() > 0){
            Record record = new Record(user, book);
            book.decreaseQuantity();
            System.out.println(book+"borrowed by"+user);
        }else {
            System.out.println("Book not available.");
        }
        System.out.println("need to work on borrow book");
    }

    //TODO return a book
    public void returnBook(){
        System.out.println("need to work on return book");
    }

}
