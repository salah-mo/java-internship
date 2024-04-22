package OOP;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;
    private final UserResourceManagement resourceManagement;

    public User(String name) {
        this.name = name;
        this.resourceManagement = new UserResourceManagement();
    }

    public UserResourceManagement getResourceManagement() {
        return this.resourceManagement;
    }

    public Object getName() {
        return this.name;
    }
}