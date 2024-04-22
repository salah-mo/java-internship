package OOP;

public class Magazine extends Resource {

    private int issueNumber;
    private int year;
    private String title;
    private String publisher;


    public Magazine(String title, String publisher, int issueNumber, int year) {
        super(title, publisher);
        this.issueNumber = issueNumber;
        this.year = year;
    }

    public Magazine() {
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
