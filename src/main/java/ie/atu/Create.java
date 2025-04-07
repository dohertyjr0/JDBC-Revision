package ie.atu;
import java.sql.*;

public class Create {
    public static void main(String[] args) throws  SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "password");

        try{
            PreparedStatement stmt = conn.prepareStatement("insert into user(name, age) values(?, ?)");
            stmt.setString(1, "Des");
            stmt.setInt(2, 22);
            stmt.executeUpdate();

            stmt = conn.prepareStatement("insert into stats(weight, height) values(?,?)");
            stmt.setInt(1, 75);
            stmt.setInt(2, 175);
            stmt.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println("Record insert failed");
            ex.printStackTrace();
        }
        conn.close();
    }
}
