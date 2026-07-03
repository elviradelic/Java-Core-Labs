package Prep1;

import java.sql.*;

public class UserCity2 {
    private static final String CONNECTION_STRING = "jdbc:mysql://db1.ibu.edu.ba:3306/shopdb";
    private static final String USERNAME = "shop_user";
    private static final String PASSWORD = " ibuSHOP2505";

    public void getUsersByCity(String city){
        try{
            Connection connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            String query = "SELECT * from users WHERE city= ?";
            PreparedStatement statement = connection.prepareStatemenet(query);
            statement.setString(1, city);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String userCity = rs.getString("city");
                System.out.println(name + userCity);
            }
            rs.close();
            statement.close();
            connection.close();



        }catch (SQLException e){
            System.out.println(e.getMessage());
        }





    }

}
