package Prep4;

import java.sql.*;

public class Two {
    private static final String CONNECTION_STRING = "jdbc:mysql://db1.ibu.edu.ba:3306/shopdb";
    private static final String USERNAME = "shop_user";
    private static final String PASSWORD="ibuSHOP2505";

    public void getUsersByNameAndCity(String name, String city){
        try{
            Connection connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME,PASSWORD);
            String query = "SELECT * FROM users WHERE name= ? AND city= ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, city);
            ResultSet rs= statement.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                System.out.println(name, city);
            }
            rs.close();
            statement.close();
            connection.close();







        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

}
