package ict301.solid.dip;

public class PostgreSQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connexion à la base PostgreSQL");
    }
}
