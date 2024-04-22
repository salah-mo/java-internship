package OOP;

public interface Borrowable {
    void borrowResource();
    void returnResource();
    boolean isBorrowed();

    String getTitle();
}