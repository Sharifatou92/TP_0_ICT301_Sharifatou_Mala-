package ict301.solid.dip;

public class UserService {

    private MySQLDatabase database = new MySQLDatabase();

    public void process() {
        database.connect();
    }
}
