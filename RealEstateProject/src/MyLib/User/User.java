package MyLib.User;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Angela
 */
public class User {
    protected String username;
    protected String password;   
    protected String fullName;
    public static String type;
    public static ArrayList<User> users = new ArrayList<User>();

    public User(String email, String password, String name, String type) {
        this.username = email;
        this.password = password;
        this.fullName = name;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getName(){
        return fullName;
    }
    public String getType() {
        return type;
    }
}
