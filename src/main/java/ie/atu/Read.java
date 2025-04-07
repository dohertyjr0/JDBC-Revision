package ie.atu;
import java.sql.*;

public class Read {
    public static void main(String[] args) throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "password");

        try{
            PreparedStatement stmt = conn.prepareStatement("update user set name = ?, age = ? where id = ?");
            stmt.setString(1, "John");
            stmt.setInt(2, 34);
            stmt.setInt(3, 1);
            stmt.executeUpdate();

            int rowCheck = stmt.executeUpdate();
            if(rowCheck > 0){
                System.out.println("Rows updated");
            }
            else{
                System.out.println("Rows not updated");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
