package OOP;

public class DVD extends Resource{

    private String director;

    private String title;

    private String publisher;

    public DVD(String title, String publisher, String director) {
        super(title, publisher);
        this.director = director;
    }

    public DVD() {

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
