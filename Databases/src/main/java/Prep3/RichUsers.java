package Prep3;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RichUsers {
    private static final String CONNECTION_STRING = "jdbc:mysql://db1.ibu.edu.ba:3306/shopdb";
    private static final String USERNAME = "shop_user";
    private static final String PASSWORD = "ibuSHOP2505";

    public void getRichUsers(double balance){
        try{
            Connection connection = DriverManager.getConnection(CONNECTION_STRING,USERNAME,PASSWORD);
            String query ="SELECT * FROM users WHERE balance> ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, balance);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int balace = rs.getInt("balance");
                System.out.println(id + "" + name + balace);
            }
            rs.close();
            statement.close();
            connection.close();



        }catch (SQLException e){
            System.out.println(e.getMessage());

        }








    }

}
