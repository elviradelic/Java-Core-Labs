package Prep2;

import java.sql.*;

public class AdultUser {
    private static final String CONNECTION_STRING = "jdbc:mysql://db1.ibu.edu.ba:3306/shopdb";
    private static final String USERNAME = "shop_user";
    private static final String PASSWORD = "ibuSHOP2505";

    public void getAdultUsers(int age){
        try{
            Connection connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            String query = "SELECT * FROM users WHERE age> ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, age);
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int userAge = rs.getInt("age");
                System.out.println(id + " " + name + "" + userAge);
            }
            rs.close();
            statement.close();
            connection.close();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
