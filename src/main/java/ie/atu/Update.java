package ie.atu;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class Update {
    public static void main(String[] args) throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "password");

        try{
            PreparedStatement stmt = conn.prepareStatement("select * from user");
            ResultSet rs = stmt.executeQuery();

            System.out.println("Users: ");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("ID " + id + ",Name " + name + ",Age" + age);
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
