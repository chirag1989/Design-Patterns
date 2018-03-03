package DesignPatterns.Singleton.MySqlConnection;

public class MakeConnectionDemo {

    public static void main(String... args) {

        MakeConnection connection = MakeConnection.getConnection();

        connection.executeStatement("select * from actor limit 5");
    }
}
