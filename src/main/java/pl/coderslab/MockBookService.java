package pl.coderslab;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service //??
public class MockBookService implements BookService{

    private static Long nextId = 4L;


    private List<Book> books;
    public MockBookService() {
        books = new ArrayList<>();
        books.add(new Book("programming", "9788324631766", "Thinking in Java", "Bruce	Eckel", "Helion", 1L));
        books.add(new Book("programmin", "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",2L
                ));
        books.add(new Book("programming", "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                3L));
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Optional<Book> get(Long id) {
            return books.stream().filter(item -> item.getId().equals(id)).findFirst();
        }

    @Override
    public void add(Book book) {
        book.setId(nextId++);
        books.add(book);
    }

    @Override
    public void delete(Long id) {
        if (get(id).isPresent()) {
            books.remove(this.get(id).get());
        }
    }


    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public void update(Book book) {
        if (this.get(book.getId()).isPresent()) {
            int indexOf = books.indexOf(this.get(book.getId()).get());
            books.set(indexOf, book);
        }
    }

}
