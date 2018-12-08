package designpatterns.mvc;

import java.util.ArrayList;
import java.util.List;


public class BookRepository {
    private List<Book> books = new ArrayList<>();

    void add(Book book){
        books.add(book);
    }

    List<Book> getBooks(){
        return books;
    }
}