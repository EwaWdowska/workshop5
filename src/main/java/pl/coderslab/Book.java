package pl.coderslab;

public class Book {


    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;

    public Book() {
    }

    public Book(String type, String publisher, String author, String title, String isbn, Long id) {
        this.type = type;
        this.publisher = publisher;
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setType(String type) {
        this.type = type;
    }
}
