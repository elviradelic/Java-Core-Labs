package LabTask;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketFetcher {
    private static final String CONNECTION_STRING = "jdbc:mysql://oop.ibu.edu.ba:3306/mtest_db?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USERNAME = "mtestdb_usr";
    private static final String PASSWORD = "mtest97dbUSR";
    private Connection connection;

    public Ticketfetcher() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public void  getTicketsByStatus(String status) throws SQLException{
        String query = "SELECT id FROM tickets WHERE status = ?";
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.setString(1, status);
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("id"))
        }


    }



}
