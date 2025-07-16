package controller;

import view.AddBookView;
import view.DeleteBookView;
import view.ShowAvailableBookView;
import view.UpdateBookQuantityView;

public class ViewController {

    public static void getAddBookView(){
        AddBookView.showAddBookView();
    }

    public static void getShowAvailableBookView(){
        ShowAvailableBookView.showAvailableBookView();
    }

    public static void getUpdateBookQuantityView(){
        UpdateBookQuantityView.updateBookQuantityView();
    }

    public static void getDeleteBookView(){
        DeleteBookView.deleteBookView();
    }
}
