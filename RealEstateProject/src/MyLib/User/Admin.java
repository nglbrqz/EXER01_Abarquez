package MyLib.User;

/**
 *
 * @author Angela
 */
public class Admin extends User{
    private int adminID;

    public Admin(String email, String password, String name, int adminID) {
        super(email, password, name, "admin");
        this.adminID = adminID;
    }
}