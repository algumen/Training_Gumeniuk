package training.PracticalExercisesPerSession_1_2_1;

/**
 * Created by Oleksii on 14.06.2015.
 */
public class User {
    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //        default constructor
    public User() {
    }

    //        parametrized constructor
    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    //          copy constructor
    public User(User aUser) {
        this(aUser.getUsername(), aUser.getPassword());

//        this.username = new String(copyUser.getUsername());
//        this.password = new String(copyUser.getPassword());
    }


}



