public class Record {
    private User user;
    private Book book;
    public Record(User user, Book book){
        this.user = user;
        this.book = book;
    }

    private String borrowedBookName;
    private boolean returnStatus;
    private int noOfBooksBorrowed;



}
