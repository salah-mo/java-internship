package OOP;

public class Book extends Resource {
    private String author;

    private String title;
    private String publisher;
    public Book(String title, String publisher, String author) {
        super(title, publisher);
        this.author = author;
    }

    public Book() {
        super();
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}