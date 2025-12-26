package ict301.solid.dip;

public class Main {
    public static void main(String[] args) {

        Database db = new MySQLDatabase();
        UserService service = new UserService(db);
        service.process();
    }
}
