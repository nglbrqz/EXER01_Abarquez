package MyLib.User;
/**
 *
 * @author Angela
 */

public class Client extends User {
    private String contactNum;

    public Client(String email, String password, String name,String contactNum) {
        super(email, password, name, "client");
        this.contactNum = contactNum;
    }
}
