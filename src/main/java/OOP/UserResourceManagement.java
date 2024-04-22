package OOP;

import java.util.ArrayList;
import java.util.List;

public class UserResourceManagement {
    private List<Borrowable> borrowedResources;

    public UserResourceManagement() {
        this.borrowedResources = new ArrayList<>();
    }

    public void borrowResource(Borrowable resource) {
        resource.borrowResource();
        this.borrowedResources.add(resource);
    }

    public void returnResource(Borrowable resource) {
        resource.returnResource();
        this.borrowedResources.remove(resource);
    }

    public String getBorrowedResources() {
        StringBuilder borrowedResources = new StringBuilder();
        for (Borrowable resource : this.borrowedResources) {
            borrowedResources.append(resource.getTitle()).append("\n");
        }
        return borrowedResources.toString();
    }
}