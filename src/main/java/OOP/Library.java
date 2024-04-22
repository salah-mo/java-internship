package OOP;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Resource> resources;
    private final List<User> users;

    public Library() {
        this.resources = new ArrayList<Resource>();
        this.users = new ArrayList<User>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void addResource(Resource resource) {
        this.resources.add(resource);
    }

    public User getUser(String userName) {
        for (User user : this.users) {
            if (user.getName().equals(userName))
                return user;
        }
        return null;
    }

    public String getBorrowedResources() {
        StringBuilder borrowedResources = new StringBuilder();
        for (Resource resource : this.resources) {
            if (resource.isBorrowed())
                borrowedResources.append(resource.getTitle()).append("\n");
        }
        return borrowedResources.toString();
    }

    public Resource[] getResources() {
        return this.resources.toArray(new Resource[0]);
    }
}