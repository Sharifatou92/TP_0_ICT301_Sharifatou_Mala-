package ict301.solid.dip;

public class UserService {

    private Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void process() {
        database.connect();
    }
}
