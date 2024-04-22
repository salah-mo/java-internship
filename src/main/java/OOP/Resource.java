package OOP;

public abstract class Resource implements Borrowable {
    private  String title;
    private String publisher;
    private boolean borrowed;

    public Resource(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
        this.borrowed = false;
    }

    public Resource( ) {
    }

    @Override
    public void borrowResource() {
        this.borrowed = true;
    }

    @Override
    public void returnResource() {
        this.borrowed = false;
    }

    @Override
    public boolean isBorrowed() {
        return this.borrowed;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPublisher() {
        return this.publisher;
    }
}