import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;

    public UserList() {
        this.users = new ArrayList<User>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }
    public void add(String username, String password, double height, double weight) {
        User user = new User(username, password);
        user.setHeight(height);
        user.setWeight(weight);
    }



    public User getUserByUsername(String username) {
        for (User user : this.users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}

