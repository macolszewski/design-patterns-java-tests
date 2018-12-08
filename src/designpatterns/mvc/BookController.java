package designpatterns.mvc;

public class BookController {

    private BookRepository bookRepository;
    private BookView bookView;

    public BookController(BookRepository bookRepository, BookView bookView) {
        this.bookRepository = bookRepository;
        this.bookView = bookView;
    }

    public void showBooks(){
        for (Book book : bookRepository.getBooks()){
            bookView.showBook(book.bookName);
        }
    }

    public void addBook() {
        String bookName = bookView.getBookName();
        Book book = new Book();
        book.bookName = bookName;
        bookRepository.add(book);
    }
}