package OOP;

public class Main {
    public static void main(String[] args) {
        // Create a new library
        Library library = new Library();

        // Create some resources
        Book book1 = new Book();
        book1.setTitle("The Great Gatsby");
        book1.setPublisher("Charles Scribner's Sons");
        book1.setAuthor("F. Scott Fitzgerald");

        Book book2 = new Book();
        book2.setTitle("To Kill a Mockingbird");
        book2.setPublisher("J. B. Lippincott & Co.");
        book2.setAuthor("Harper Lee");

        Book book3 = new Book();
        book3.setTitle("1984");
        book3.setPublisher("Secker & Warburg");
        book3.setAuthor("George Orwell");

        DVD dvd1 = new DVD();
        dvd1.setTitle("The Shawshank Redemption");
        dvd1.setPublisher("Columbia Pictures");
        dvd1.setDirector("Frank Darabont");

        DVD dvd2 = new DVD();
        dvd2.setTitle("The Godfather");
        dvd2.setPublisher("Paramount Pictures");
        dvd2.setDirector("Francis Ford Coppola");

        DVD dvd3 = new DVD();
        dvd3.setTitle("The Dark Knight");
        dvd3.setPublisher("Warner Bros. Pictures");
        dvd3.setDirector("Christopher Nolan");

        Magazine magazine1 = new Magazine();
        magazine1.setTitle("National Geographic");
        magazine1.setPublisher("National Geographic Society");
        magazine1.setIssueNumber(1);
        magazine1.setYear(1888);

        Magazine magazine2 = new Magazine();
        magazine2.setTitle("Time");
        magazine2.setPublisher("Time USA, LLC");
        magazine2.setIssueNumber(1);
        magazine2.setYear(1923);

        Magazine magazine3 = new Magazine();
        magazine3.setTitle("The Economist");
        magazine3.setPublisher("The Economist Newspaper Limited");
        magazine3.setIssueNumber(1);
        magazine3.setYear(1843);


        // Add the resources to the library
        library.addResource(book1);
        library.addResource(book2);
        library.addResource(book3);
        library.addResource(dvd1);
        library.addResource(dvd2);
        library.addResource(dvd3);
        library.addResource(magazine1);
        library.addResource(magazine2);
        library.addResource(magazine3);


        // Create a user
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");


        // Add the user to the library
        library.addUser(user1);
        library.addUser(user2);
        library.addUser(user3);

        // Have the user borrow a resource
        user1.getResourceManagement().borrowResource(dvd1);
        user1.getResourceManagement().borrowResource(magazine1);
        user2.getResourceManagement().borrowResource(book2);
        user2.getResourceManagement().borrowResource(magazine2);
        user3.getResourceManagement().borrowResource(book3);
        user3.getResourceManagement().borrowResource(dvd3);

        //print out the user's borrowed resources
        System.out.println("User1 borrowed resources: ");
        System.out.println(user1.getResourceManagement().getBorrowedResources());

        System.out.println("User2 borrowed resources: ");
        System.out.println(user2.getResourceManagement().getBorrowedResources());

        System.out.println("User3 borrowed resources: ");
        System.out.println(user3.getResourceManagement().getBorrowedResources());


        // print out the library's resources that are borrowed
        System.out.println("Library's borrowed resources: ");
        System.out.println(library.getBorrowedResources());

        //get all the resources in the library
        System.out.println("All library's resources: ");
        for (Resource resource : library.getResources()) {
            System.out.println(resource.getTitle());
        }

        //get all resources that did not get borrowed
        System.out.println("Library's available resources: ");
        for (Resource resource : library.getResources()) {
            if (!resource.isBorrowed())
                System.out.println(resource.getTitle());
        }
    }
}