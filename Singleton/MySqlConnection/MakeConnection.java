package DesignPatterns.Singleton.MySqlConnection;

import java.sql.*;

public class MakeConnection {

    private static MakeConnection makeConnection = null;
    private Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/sakila";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private MakeConnection() {

        System.out.println("A connection is getting created");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("A connection is created");
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static MakeConnection getConnection() {

        if (makeConnection == null) {
            makeConnection = new MakeConnection();
        }

        return makeConnection;
    }

    public void executeStatement(String statement) {

        try {
            System.out.println(statement);

            Statement stmt = makeConnection.connection.createStatement();
            ResultSet rs = stmt.executeQuery(statement);

            while(rs.next()) {
                System.out.println(rs.toString());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
