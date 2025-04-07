package ie.atu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class dbConnection {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "password");
            System.out.println("Connection made to database");
        }
        catch(ClassNotFoundException| SQLException e){
            e.printStackTrace();
        }
        finally{
            if(connection != null){
                try{
                    connection.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
