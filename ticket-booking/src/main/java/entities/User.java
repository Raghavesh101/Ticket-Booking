package entities;
import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashpassword;
    private List<Ticket> ticketsBooked;
    private String userId;

    public Object getName() {
        return name;
    }
}
